package com.coderscampus.Assignment3;


import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) {
		
		UserService.dataRead();
		UserService.getUsers();
		Scanner scanner = new Scanner(System.in);
		int attempts = 5;
	
		while (attempts > 0) {
			System.out.println("Please enter your Username:");
			String usernameInput = scanner.nextLine();
			System.out.println("Please enter your password:");
			String passwordInput = scanner.nextLine();
			
			if (UserService.validateInput(usernameInput, passwordInput)) {
				String name = UserService.getNamebyUsername(usernameInput);
				System.out.println("Welcome " + name);
				break;
			} else { 
				attempts--;
				if (attempts == 0) {
					System.out.println("Too many failed attempts, you are now locked out.");
					break;
				}
				System.out.println("Invalid login, please try again.");
				continue;
			}
						
		} scanner.close();
	}
}


 