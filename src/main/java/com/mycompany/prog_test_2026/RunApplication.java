/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
 * to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java 
 * to edit this template
 */

package com.mycompany.prog_test_2026;

import java.util.Scanner;

/**
 *
 * @author emeris
 */
public class RunApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Display console options
        System.out.println("Select a console:");
                      System.out.println("1. PS5");
        System.out.println("2. XBoX");
        System.out.println("3. SWITCH");

        System.out.print("Enter Your choice: ");
        int choice = input.nextInt();
        input.nextLine();

        String consoleType;

        // Determine which console was selected
        switch (choice) {

            case 1:
                consoleType = "PS5";
                break;

            case 2:
                consoleType = "XBOX";
                break;

            case 3:
                consoleType = "SWITCH";
                break;

            default:
                consoleType = "Unknown";
                break;
        }


        System.out.print("Enter the store name: ");
                String store = input.nextLine();

        // Ask user for total sales
        System.out.print("Enter the total sales: ");
        int totalSales = input.nextInt();

 
               ConsoleSales sales = new ConsoleSales(
                consoleType,
                store,
                totalSales
        );

       
        sales.printReport();

        input.close();
    }
}