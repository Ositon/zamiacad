/*******************************************************************************
 * Copyright (c) 2000, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.zamia.plugin.views.fsm.model.commands;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.commands.Command;
import org.zamia.plugin.views.fsm.model.FSMState;
import org.zamia.plugin.views.fsm.model.StructuredFSMState;
import org.zamia.plugin.views.fsm.model.Transition;


/**
 * Handles the deletion of Activities.
 * 
 * @author Daniel Lee
 */
public class DeleteCommand extends Command {

	private FSMState child;

	private StructuredFSMState parent;

	private int index = -1;

	@SuppressWarnings("unchecked")
	private List sourceConnections = new ArrayList();

	@SuppressWarnings("unchecked")
	private List targetConnections = new ArrayList();

	@SuppressWarnings("unchecked")
	private void deleteConnections(FSMState a) {
		if (a instanceof StructuredFSMState) {
			List children = ((StructuredFSMState) a).getChildren();
			for (int i = 0; i < children.size(); i++)
				deleteConnections((FSMState) children.get(i));
		}
		sourceConnections.addAll(a.getIncomingTransitions());
		for (int i = 0; i < sourceConnections.size(); i++) {
			Transition t = (Transition) sourceConnections.get(i);
			t.source.removeOutput(t);
			a.removeInput(t);
		}
		targetConnections.addAll(a.getOutgoingTransitions());
		for (int i = 0; i < targetConnections.size(); i++) {
			Transition t = (Transition) targetConnections.get(i);
			t.target.removeInput(t);
			a.removeOutput(t);
		}
	}

	/**
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	public void execute() {
		primExecute();
	}

	/**
	 * Invokes the execution of this command.
	 */
	protected void primExecute() {
		deleteConnections(child);
		index = parent.getChildren().indexOf(child);
		parent.removeChild(child);
	}

	/**
	 * @see org.eclipse.gef.commands.Command#redo()
	 */
	public void redo() {
		primExecute();
	}

	private void restoreConnections() {
		for (int i = 0; i < sourceConnections.size(); i++) {
			Transition t = (Transition) sourceConnections.get(i);
			t.target.addInput(t);
			t.source.addOutput(t);
		}
		sourceConnections.clear();
		for (int i = 0; i < targetConnections.size(); i++) {
			Transition t = (Transition) targetConnections.get(i);
			t.source.addOutput(t);
			t.target.addInput(t);
		}
		targetConnections.clear();
	}

	/**
	 * Sets the child to the passed Activity
	 * 
	 * @param a
	 *            the child
	 */
	public void setChild(FSMState a) {
		child = a;
	}

	/**
	 * Sets the parent to the passed StructuredActivity
	 * 
	 * @param sa
	 *            the parent
	 */
	public void setParent(StructuredFSMState sa) {
		parent = sa;
	}

	/**
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	public void undo() {
		parent.addChild(child, index);
		restoreConnections();
	}

}
