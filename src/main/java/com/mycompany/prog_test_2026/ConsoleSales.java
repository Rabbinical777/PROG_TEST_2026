package com.mycompany.prog_test_2026;

public class ConsoleSales extends Console {

    // Constructor
    public ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }

    // Print report
    public void printReport() {

        System.out.println();
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("------------------------------");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: R " + getTotalSales());
        System.out.println("------------------------------");
    }
}