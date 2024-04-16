package com.coderscampus.Assignment3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileService {

	public static User[] dataRead() {

		User[] userArr = new User[4];
		BufferedReader fileReader = null;
		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
		String line;
		int i = 0;
		try {
			while ((line = fileReader.readLine()) != null) {
				String[] userLine = line.split(",");
				userArr[i] = new User(userLine[0], userLine[1], userLine[2]);
				i++;
			}
		} catch (IOException e) {
			System.out.println("I/O exception");
			e.printStackTrace();
		}
		return userArr;
	}
	
}
