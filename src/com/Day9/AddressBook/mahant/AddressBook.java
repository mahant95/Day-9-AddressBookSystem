package com.Day9.AddressBook.mahant;
import java.util.Scanner;

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
    void display(){
        System.out.println(Name+" "+Address+" "+City+" "+Email+" "+Number+" ");
    }
    public static void main(String[] args) {
       AddressBook ads = new AddressBook();
       ads.display();
       ads.AddNew();
    }
}