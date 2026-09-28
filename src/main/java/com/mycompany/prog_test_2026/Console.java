/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
 * to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java 
 * to edit this template
 */

package com.mycompany.prog_test_2026;

/**
 *
 * @author emeris
 */

public abstract class Console implements IConsoles {

    // Variables
    private String consoleType;
    private String store;
    private int totalSales;

    // Constructor
    public Console(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

  
    @Override
    public String getConsoleType() {
        return consoleType;
    }

    // Return store
    @Override
    public String getStore() {
        return store;
    }

    // Return total sales
    @Override
    public int getTotalSales() {
        return totalSales;
    }
}


