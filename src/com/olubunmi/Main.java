package com.olubunmi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code about petshop declaration


       Petshop petshopName = new Petshop ("Southside pet shop");
        System.out.println("Welcome to Java " + petshopName.getPetshopName());
        Scanner scanner = new Scanner(System.in);
        System.out.println("How can we be of service? \n Please choose: \n 1. To ask for pet inventory \n 2. To buy pet.\n 3. To Exit");
        int input = scanner.nextInt();
        scanner.nextLine();

    }
}
