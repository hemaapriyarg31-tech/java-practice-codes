package com.library;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Simple Library Manager ===");

        System.out.print("Enter Book Name: ");
        String book = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        System.out.println("\n=== Book Details ===");
        System.out.println("Book ID      : " + id);
        System.out.println("Book Name    : " + book);
        System.out.println("Author Name : " + author);
        System.out.println("Book Issued Successfully ✅");

        sc.close();
    }
}
