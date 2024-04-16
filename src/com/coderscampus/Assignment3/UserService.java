package com.coderscampus.Assignment3;

public class UserService {

	private User[] users;

	public UserService() {
		users = FileService.dataRead();
	}

	public User getNameByUsernameAndPassword(String username, String password) {
		for (User user : users) {
			if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}
}
