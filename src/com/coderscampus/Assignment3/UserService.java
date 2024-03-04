package com.coderscampus.Assignment3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UserService {
	
	
	
	BufferedReader fileReader = null;
	
	
	public static User[] dataRead(String textFile) throws IOException {
			User[] userArr = new User[4];
			BufferedReader fileReader = new BufferedReader(new FileReader(textFile));
			String line;
			int i = 0;
				while ((line = fileReader.readLine()) != null) {
					String[] userLine = line.split(",");
					userArr[i] = new User(userLine[0], userLine[1], userLine[2]);
					i++;
				}
	
			return userArr;
				}
			
	
}

