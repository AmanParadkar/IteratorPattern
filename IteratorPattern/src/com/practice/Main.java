package com.practice;

public class Main {

	public static void main(String[] args) {

		UserManagement userManagement = new UserManagement();
		
		userManagement.addUser(new User("Aman","12"));
		userManagement.addUser(new User("Jay","12"));
		userManagement.addUser(new User("om","12"));
		userManagement.addUser(new User("kadey","12"));
		
		MyIterator myIterator = userManagement.getIterator();
		while(myIterator.hasNext())
		{
			User user = (User)myIterator.next();
			System.out.println(user.getName()+" "+user.getUserId());
		}
	}

}
