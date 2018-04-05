
package com.wasafi;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExceptionHandler {
	
	//This is the Global Class
	@ExceptionHandler(value = FileNotFoundException.class)
	public void handle(FileNotFoundException ex, HttpServletResponse response) throws IOException {
		System.out.println("handling file not found exception");
		response.sendError(404, ex.getMessage());
	}

	
	public void handle(IOException ex, HttpServletResponse response) throws IOException {
		 System.out.println("handling io exception");
		 response.sendError(500, ex.getMessage());
	}
}
