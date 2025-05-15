package org.magnitia.seleniumpractice;

import java.util.Scanner;

public class UsingScanner {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user name :");
		String uName=sc.nextLine();
		
		System.out.println("User Name is :"+uName);

	}

}

