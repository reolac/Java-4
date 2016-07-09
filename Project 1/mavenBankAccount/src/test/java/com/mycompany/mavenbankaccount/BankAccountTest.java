/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenbankaccount;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michael
 */
public class BankAccountTest {
    
    public BankAccountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of deposit method, of class BankAccount.
     */
    @Test
    public void testDeposit() {
        System.out.println("deposit");
        double amount = 0.0;
        BankAccount instance = new BankAccount();
        instance.deposit(amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of withdraw method, of class BankAccount.
     */
    @Test
    public void testWithdraw() {
        System.out.println("withdraw");
        double amount = 0.0;
        BankAccount instance = new BankAccount();
        instance.withdraw(amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBalance method, of class BankAccount.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        BankAccount instance = new BankAccount();
        double expResult = 500.0;
        double result = instance.getBalance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of transfer method, of class BankAccount.
     */
    @Test
    public void testTransfer() {
        System.out.println("transfer");
        double amount = 0.0;
        BankAccount other = new BankAccount();
        BankAccount instance = new BankAccount();
        instance.transfer(amount, other);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of toString method, of class BankAccount.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        BankAccount instance = new BankAccount();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
