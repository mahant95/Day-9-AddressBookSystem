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
    void deletePerson(String name) {
        if (Name.equals(name)) {
            Name = null;
            Number = 0;
            Address = null;
            City = null;
            Email = null;
            System.out.println("The Data is Deleted");
        }else{
            System.out.println("Data Is Not Deleted ");
        }
    }

    public static void main(String[] args) {
       AddressBook ads = new AddressBook();
       ads.AddNew();
       ads.deletePerson(ads.Name);
    }
}