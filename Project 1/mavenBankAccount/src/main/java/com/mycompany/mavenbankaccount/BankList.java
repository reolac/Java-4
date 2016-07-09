/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenbankaccount;

import org.apache.commons.collections4.list.GrowthList;

/**
 *
 * @author Michael
 */
public class BankList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GrowthList bank = new GrowthList();
        
        BankAccount bank1 = new BankAccount();
        BankAccount bank2 = new BankAccount();
        BankAccount bank3 = new BankAccount();
        
        bank.add(bank1);
        bank.add(bank2);
        bank.add(bank3);
        
        System.out.println(bank);
    }
    
}
