package com.Day9.AddressBook.mahant;
import java.util.Scanner;

public class AddressBook {
	public String firstName;
	public String lastName;
	public String phoneNumber;
	public String address;
	public int pincode;
	public String email;

	public AddressBook(String firstName, String lastName,String phoneNumber, String address
			, int pincode, String email) {

		this.firstName=firstName;
		this.lastName=lastName;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.pincode=pincode;
		this.email=email;
	}
	public void newAddressBookDataEnter() {
		System.out.println(firstName+" "+lastName+" "+phoneNumber+
				" "+address+" "+pincode+"  "+email);

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("First Name Enter");
		String firstName=sc.next();
		System.out.println("Last Name Enter");
		String lastName=sc.next();
		System.out.println("PhoneNumber Enter");
		String phoneNumber=sc.next();
		System.out.println(" Address Enter");
		String address=sc.next();
		System.out.println(" PinCode Enter");
		int pincode=sc.nextInt();
		System.out.println(" Email Enter");
		String email=sc.next();
		AddressBook addrsBook=new AddressBook(firstName,lastName,phoneNumber,address,pincode,email);
	addrsBook.newAddressBookDataEnter();
	}

	}
