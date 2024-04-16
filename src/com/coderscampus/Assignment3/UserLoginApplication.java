package com.coderscampus.Assignment3;


import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		int attempts = 5;
		UserService userService = new UserService();
		User loggedInUser = null;
		while (attempts > 0) {
			System.out.println("Enter your email:");
			String usernameInput = scanner.nextLine();
			System.out.println("Enter your password:");
			String passwordInput = scanner.nextLine();
			
			loggedInUser = userService.getNameByUsernameAndPassword(usernameInput, passwordInput);
			if (loggedInUser != null) {
				System.out.println("Welcome: " + loggedInUser.getName());
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


 