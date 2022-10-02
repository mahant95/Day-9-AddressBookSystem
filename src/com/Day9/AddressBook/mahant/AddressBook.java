package com.Day9.AddressBook.mahant;
import java.util.*;

public class AddressBook {
	 String Name ;
	    String Address;
	    String City;
	    String Email;
	   int Number;
	    public void AddNew(){
	        Scanner sc = new Scanner (System.in);
	        System.out.println("Enter the Name");
	        Name = sc.nextLine();
	        System.out.println("Enter the address");
	        Address = sc.nextLine();
	        System.out.println("Enter the City");
	        City = sc.nextLine();
	        System.out.println("Enter the mail");
	        Email = sc.nextLine();
	        System.out.println("Enter the Number");
	        Number = sc.nextInt();
	    }
	    void changeCity(String Edit){
	        Scanner sc = new Scanner(System.in);
	        if(Edit.equals(Name));
	        System.out.println("Enter the New City");
	        City = sc.nextLine();
	        System.out.println(Name+" "+Address+" "+City+" "+Email+ " "+Number+" ");
	    }

	    public static void main(String[] args) {
	       AddressBook ads = new AddressBook();
	       ads.AddNew();
	       ads.changeCity("New City ");
	    }
	}