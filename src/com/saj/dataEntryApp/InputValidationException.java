package com.saj.dataEntryApp;

import java.awt.Component;

@SuppressWarnings("serial")
public class InputValidationException extends Exception {
	protected Component errorSource;
	
	public InputValidationException(String message, Component source) {
		super(message);
		errorSource = source;
	}
	
	public Component getErrorSource() {
		return errorSource;
	}
}
