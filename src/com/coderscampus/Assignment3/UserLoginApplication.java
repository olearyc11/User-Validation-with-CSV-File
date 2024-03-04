package com.coderscampus.Assignment3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class UserLoginApplication {

	public static void main(String[] args) throws IOException {
	
		String filepath = "data.txt";
		UserService.dataRead(filepath);
		
		
	}
}

 