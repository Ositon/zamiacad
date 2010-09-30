/* Generated By:JavaCC: Do not edit this line. VCDParserConstants.java */
/* 
 * Copyright 2009 by the authors indicated in the @author tags. 
 * All rights reserved. 
 * 
 * See the LICENSE file for details.
 * 
 * 
 */

package org.zamia.instgraph.sim.vcd.parser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface VCDParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int DECLARATION_COMMAND = 16;
  /** RegularExpression Id. */
  int END = 18;
  /** RegularExpression Id. */
  int DUMPALL = 19;
  /** RegularExpression Id. */
  int DUMPOFF = 20;
  /** RegularExpression Id. */
  int DUMPON = 21;
  /** RegularExpression Id. */
  int DUMPVARS = 22;
  /** RegularExpression Id. */
  int SCOPE = 23;
  /** RegularExpression Id. */
  int UPSCOPE = 24;
  /** RegularExpression Id. */
  int VAR = 25;
  /** RegularExpression Id. */
  int TIMESCALE = 26;
  /** RegularExpression Id. */
  int digit = 27;
  /** RegularExpression Id. */
  int DECIMAL_NUMBER = 28;
  /** RegularExpression Id. */
  int SIMULATION_TIME = 29;
  /** RegularExpression Id. */
  int VECTOR_VALUE = 30;
  /** RegularExpression Id. */
  int BINARY_NUMBER = 31;
  /** RegularExpression Id. */
  int exponent = 32;
  /** RegularExpression Id. */
  int REAL_NUMBER = 33;
  /** RegularExpression Id. */
  int VALUE = 34;
  /** RegularExpression Id. */
  int SCALAR_VALUE_CHANGE = 35;
  /** RegularExpression Id. */
  int IDENTIFIER_CHARACTER = 36;
  /** RegularExpression Id. */
  int IDENTIFIER_CODE = 37;
  /** RegularExpression Id. */
  int BEGIN = 38;
  /** RegularExpression Id. */
  int FORK = 39;
  /** RegularExpression Id. */
  int FUNCTION = 40;
  /** RegularExpression Id. */
  int MODULE = 41;
  /** RegularExpression Id. */
  int TASK = 42;
  /** RegularExpression Id. */
  int EVENT = 43;
  /** RegularExpression Id. */
  int INTEGER = 44;
  /** RegularExpression Id. */
  int PARAMETER = 45;
  /** RegularExpression Id. */
  int REAL = 46;
  /** RegularExpression Id. */
  int REALTIME = 47;
  /** RegularExpression Id. */
  int REG = 48;
  /** RegularExpression Id. */
  int SUPPLY0 = 49;
  /** RegularExpression Id. */
  int SUPPLY1 = 50;
  /** RegularExpression Id. */
  int TIME = 51;
  /** RegularExpression Id. */
  int TRI = 52;
  /** RegularExpression Id. */
  int TRIAND = 53;
  /** RegularExpression Id. */
  int TRIOR = 54;
  /** RegularExpression Id. */
  int TRIREG = 55;
  /** RegularExpression Id. */
  int TRI0 = 56;
  /** RegularExpression Id. */
  int TRI1 = 57;
  /** RegularExpression Id. */
  int WAND = 58;
  /** RegularExpression Id. */
  int WIRE = 59;
  /** RegularExpression Id. */
  int WOR = 60;
  /** RegularExpression Id. */
  int VAR_END = 61;
  /** RegularExpression Id. */
  int VAR_DIGIT = 62;
  /** RegularExpression Id. */
  int VAR_DECIMAL_NUMBER = 63;
  /** RegularExpression Id. */
  int VAR_LETTER = 64;
  /** RegularExpression Id. */
  int VAR_LETTER_OR_DIGIT = 65;
  /** RegularExpression Id. */
  int VAR_ID = 66;
  /** RegularExpression Id. */
  int LBRACKET = 67;
  /** RegularExpression Id. */
  int RBRACKET = 68;
  /** RegularExpression Id. */
  int COLON = 69;
  /** RegularExpression Id. */
  int VARB_DIGIT = 70;
  /** RegularExpression Id. */
  int VARB_DECIMAL_NUMBER = 71;
  /** RegularExpression Id. */
  int VAR_IDENTIFIER_CHARACTER = 72;
  /** RegularExpression Id. */
  int VAR_IDENTIFIER_CODE = 73;
  /** RegularExpression Id. */
  int TS_DIGIT = 74;
  /** RegularExpression Id. */
  int TS_DECIMAL_NUMBER = 75;
  /** RegularExpression Id. */
  int SECOND = 76;
  /** RegularExpression Id. */
  int MSECOND = 77;
  /** RegularExpression Id. */
  int USECOND = 78;
  /** RegularExpression Id. */
  int NSECOND = 79;
  /** RegularExpression Id. */
  int PSECOND = 80;
  /** RegularExpression Id. */
  int FSECOND = 81;

  /** Lexical state. */
  int TS_MODE = 0;
  /** Lexical state. */
  int VAR_BRACKET_MODE = 1;
  /** Lexical state. */
  int VAR_MODE = 2;
  /** Lexical state. */
  int VAR_ID_MODE = 3;
  /** Lexical state. */
  int SCOPE_MODE = 4;
  /** Lexical state. */
  int ID_MODE = 5;
  /** Lexical state. */
  int DEFAULT = 6;
  /** Lexical state. */
  int COMMENT = 7;
  /** Lexical state. */
  int DECLARATION = 8;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\t\"",
    "\"\\b\"",
    "\"\\u0000\"",
    "\"\\f\"",
    "\"\\u00a0\"",
    "\"\\ufffd\"",
    "\"$comment\"",
    "\"$end\"",
    "<token of kind 12>",
    "\"$date\"",
    "\"$enddefinitions\"",
    "\"$version\"",
    "\"$end\"",
    "<token of kind 17>",
    "\"$end\"",
    "\"$dumpall\"",
    "\"$dumpoff\"",
    "\"$dumpon\"",
    "\"$dumpvars\"",
    "\"$scope\"",
    "\"$upscope\"",
    "\"$var\"",
    "\"$timescale\"",
    "<digit>",
    "<DECIMAL_NUMBER>",
    "<SIMULATION_TIME>",
    "<VECTOR_VALUE>",
    "<BINARY_NUMBER>",
    "<exponent>",
    "<REAL_NUMBER>",
    "<VALUE>",
    "<SCALAR_VALUE_CHANGE>",
    "<IDENTIFIER_CHARACTER>",
    "<IDENTIFIER_CODE>",
    "\"begin\"",
    "\"fork\"",
    "\"function\"",
    "\"module\"",
    "\"task\"",
    "\"event\"",
    "\"integer\"",
    "\"parameter\"",
    "\"real\"",
    "\"realtime\"",
    "\"reg\"",
    "\"supply0\"",
    "\"supply1\"",
    "\"time\"",
    "\"tri\"",
    "\"triand\"",
    "\"trior\"",
    "\"trireg\"",
    "\"tri0\"",
    "\"tri1\"",
    "\"wand\"",
    "\"wire\"",
    "\"wor\"",
    "\"$end\"",
    "<VAR_DIGIT>",
    "<VAR_DECIMAL_NUMBER>",
    "<VAR_LETTER>",
    "<VAR_LETTER_OR_DIGIT>",
    "<VAR_ID>",
    "\"[\"",
    "\"]\"",
    "\":\"",
    "<VARB_DIGIT>",
    "<VARB_DECIMAL_NUMBER>",
    "<VAR_IDENTIFIER_CHARACTER>",
    "<VAR_IDENTIFIER_CODE>",
    "<TS_DIGIT>",
    "<TS_DECIMAL_NUMBER>",
    "\"s\"",
    "\"ms\"",
    "\"us\"",
    "\"ns\"",
    "\"ps\"",
    "\"fs\"",
  };

}
