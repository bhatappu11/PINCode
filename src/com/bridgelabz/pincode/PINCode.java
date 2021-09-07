package com.bridgelabz.pincode;

import java.util.Scanner;
import java.util.regex.*;

public class PINCode {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the pin code");
		String pinCode = scanner.next();
		System.out.println("Is the pin code valid?");
		if(checkForValidPinCode(pinCode))
			System.out.println("It is valid");
		else
			System.out.println("It is invalid");

	}

	private static boolean checkForValidPinCode(String pinCode) {
		String regex = "^[0-9]{6}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(pinCode);
		return matcher.matches();
		
	}

}
