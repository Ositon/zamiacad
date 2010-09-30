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


import org.eclipse.gef.commands.Command;
import org.zamia.plugin.views.fsm.model.FSMState;
import org.zamia.plugin.views.fsm.model.StructuredFSMState;


/**
 * @author Daniel Lee
 */
public class CreateCommand extends Command {

private StructuredFSMState parent;
private FSMState child;
private int index = -1;

/**
 * @see org.eclipse.gef.commands.Command#execute()
 */
public void execute() {
	if (index > 0)
		parent.addChild(child, index);
	else
		parent.addChild(child);
}

/**
 * Sets the index to the passed value
 * @param i the index
 */
public void setIndex(int i) {
	index = i;
}

/**
 * Sets the parent ActivityDiagram
 * @param sa the parent
 */
public void setParent(StructuredFSMState sa) {
	parent = sa;
}

/**
 * Sets the Activity to create
 * @param activity the Activity to create
 */
public void setChild(FSMState activity) {
	child = activity;
	child.setName("a " + (parent.getChildren().size() + 1));
}

/**
 * @see org.eclipse.gef.commands.Command#undo()
 */
public void undo() {
	parent.removeChild(child);
}

}
