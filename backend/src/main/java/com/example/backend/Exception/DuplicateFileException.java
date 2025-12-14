package com.example.backend.Exception;

public class DuplicateFileException extends RuntimeException{
	public DuplicateFileException(String message) {
	super(message);
	}

}
