package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String firstName;
    String lastName;
    String favouriteColour;
    int birthDay;
    int birthMonth;
    int birthYear;

    System.out.println("Inserire il proprio nome");
    firstName = in.nextLine();

    System.out.println("Inserire il proprio cognome");
    lastName = in.nextLine();

    System.out.println("Inserire il proprio colore preferito");
    favouriteColour = in.nextLine();

    System.out.println("Inserire il proprio giorno di nascita");
    birthDay = in.nextInt();

    System.out.println("Inserire il proprio mese di nascita");
    birthMonth = in.nextInt();

    System.out.println("Inserire il proprio anno di nascita");
    birthYear = in.nextInt();

    int birthSum = birthDay + birthMonth + birthYear;

    String resultingPassword = firstName + "-" + lastName + "-" + favouriteColour + "-" + birthSum;

    System.out.println("La password generata è: " + resultingPassword);
  }
}
