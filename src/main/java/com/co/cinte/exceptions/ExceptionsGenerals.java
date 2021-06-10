package com.co.cinte.exceptions;

import net.serenitybdd.core.exceptions.SerenityManagedException;
@SuppressWarnings("serial")
public class ExceptionsGenerals extends SerenityManagedException{


	public static final String MESSAGE_ERROR_MENU
	    = "The menu could not be found, please verify that seed is not restarting";
	  public static final String MESSAGE_ERROR = "The message hasn't the waited";
	  public static final String MESSAGE_ERROR_DATABASE
	    = "The time to activation has delayed or It has present problems of activation";
	  public static final String MESSAGE_TIME_WAIT = "The time wait has been exceeded";
	  public static final String MESSAGE_ELEMNT_NOT_FOUND = "The element doesn´t found";
	  public static final String MESSAGE_NOT_CLICK = "The command may not be completed as the element receiving the events is concealing the element which was requested clicked.";
	  public static final String MESSAGE_ELEMENT_NOT_SELECT = "Can't be clicked selected the element";
	  public static final String MESSAGE_ALERT_NOT_PRESENT = "Alert box is not present";
	  public static final String MESSAGE_SQL = "There is same problem with data base";
	  public static final String MESSAGE_CLASS= "There is same problem with the class";

	  public ExceptionsGenerals(String message, Throwable testErrorException) {
	    super(message, testErrorException);
	  }
}
