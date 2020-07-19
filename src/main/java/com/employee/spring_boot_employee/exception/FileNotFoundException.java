package com.employee.spring_boot_employee.exception;

public class FileNotFoundException extends RuntimeException {

	 private static final long serialVersionUID = 1L;

	    public FileNotFoundException(String message) {
	        super(message);
	    }

	    public FileNotFoundException(String message, Throwable cause) {
	        super(message, cause);
	    }
}
