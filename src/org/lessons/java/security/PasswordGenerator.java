package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String firstName;
    String lastName;
    String favouriteColour;
    byte birthDay;
    byte birthMonth;
    short birthYear;

    System.out.println("Inserire il proprio nome");
    firstName = in.nextLine();

    System.out.println("Inserire il proprio cognome");
    lastName = in.nextLine();

    System.out.println("Inserire il proprio colore preferito");
    favouriteColour = in.nextLine();

    System.out.println("Inserire il proprio giorno di nascita");
    birthDay = in.nextByte();

    System.out.println("Inserire il proprio mese di nascita");
    birthMonth = in.nextByte();

    System.out.println("Inserire il proprio anno di nascita");
    birthYear = in.nextShort();

    String resultingPassword;
  }
}
