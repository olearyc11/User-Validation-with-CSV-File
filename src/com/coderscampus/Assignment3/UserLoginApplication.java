package com.coderscampus.Assignment3;


import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) {
		
		UserService.dataRead();
		UserService.getUsers();
		Scanner scanner = new Scanner(System.in);
		int attempts = 5;
	
		while (attempts > 0) {
			System.out.println("Enter your email:");
			String usernameInput = scanner.nextLine();
			System.out.println("Enter your password:");
			String passwordInput = scanner.nextLine();
			
			if (UserService.validateInput(usernameInput, passwordInput)) {
				String name = UserService.getNamebyUsername(usernameInput);
				System.out.println("Welcome: " + name);
				break;
			} else { 
				attempts--;
				if (attempts == 0) {
					System.out.println("Too many failed login attempts, you are now locked out.");
					break;
				}
				System.out.println("Invalid login, please try again.");
				continue;
			}
						
		} scanner.close();
	}
}


 