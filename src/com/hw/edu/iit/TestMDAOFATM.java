/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

import java.util.*;

/**
 *
 * @author Owner
 */

class TestATM1 {
    //Acess to ATM interface
    ATMSystemClasses atmClasses;

    //ATM ONE input processor
    ATMSystem atmONE;

    TestATM1(ATMSystemClasses atm) {
      atmClasses = atm;
      doTest();
    }

    private void doTest() {
      boolean input = true;
      int opt = 0;
      Scanner scan = new Scanner(System.in);
      atmONE = atmClasses.getATMSystemOne();

      while(input) {
        System.out.println();
        System.out.println("Select operation to perform: ");
        System.out.println("1(card), 2(pin), 3(deposit), 4(withdraw), 5(balance), 6(lock), 7(unlock), 8(exit)");
        opt = scan.nextInt();
        switch(opt) {
            case 1 : //card
              int balance, pin;
              System.out.println("Operation: card(int x, int y)");
              System.out.println("Enter value of x (Balance)");
              balance = scan.nextInt();
              System.out.println("Enter value of y (Pin)");
              pin = scan.nextInt();
              atmONE.card(balance, pin);
              break;
             case 2 : //pin
               int pinEntered;
               System.out.println("Operation: pin(int x)");
               System.out.println("Enter value of x (Pin)");
               pinEntered = scan.nextInt();
               atmONE.pin(pinEntered);
               break;
            case 3 : //deposit
              int dAmount;
              System.out.println("Operation: deposit(int d)");
              System.out.println("Enter value of d (Amount to deposit)");
              dAmount = scan.nextInt();
              atmONE.deposit(dAmount);
              break;
            case 4 :  //withdraw
              int wAmount;
              System.out.println("Operation: withdraw(int w)");
              System.out.println("Enter value of w (Amount to withdraw)");
              wAmount = scan.nextInt();
              atmONE.withdraw(wAmount);
              break;
            case 5 :  //balance
              System.out.println("Operation: balance() selected");
              atmONE.balance();
              break;
            case 6 :  //lock
              int pinToLock;
              System.out.println("Operation: lock(int x)");
              System.out.println("Enter value of x (pin)");
              pinToLock = scan.nextInt();
              atmONE.lock(pinToLock);
              break;
            case 7 : //unlock
              int pinToUnlock;
              System.out.println("Operation: unlock(int x)");
              System.out.println("Enter value of x (pin)");
              pinToUnlock = scan.nextInt();
              atmONE.unlock(pinToUnlock);
              break;
            case 8 : //exit
              input = false;
              System.out.println("Operation: exit() selected");
              atmONE.exit();
              break;
            default : 
              break;
        } 
      } //while

    } //doTest

}  //TestATM1

class TestATM2 {

    //Acess to ATM interface
    ATMSystemClasses atmClasses;

    //ATM TWO input processor
    ATMSystemTwo atmTWO;

    TestATM2(ATMSystemClasses atm) {
      atmClasses = atm;
      doTest();
    }

    private void doTest() {
      boolean input = true;
      int opt = 0;
      atmTWO = atmClasses.getATMSystemTwo();
      Scanner scan = new Scanner(System.in);

      while(input) {
        System.out.println();
        System.out.println("Select operation to perform: ");
        System.out.println("1(CARD), 2(PIN), 3(DEPOSIT), 4(WITHDRAW), 5(BALANCE), 6(EXIT)");
        opt = scan.nextInt();
        switch(opt) {
            case 1: {  //CARD
              float balance = 0;
              String pin = null;
              System.out.println("Operation: CARD(float x, String y)");
              System.out.println("Enter value of x (Balance)");
              balance = scan.nextFloat();
              System.out.println("Enter value of y (Pin)");
              pin = scan.next();
              atmTWO.CARD(balance, pin);
              break;
            }
            case 2: {  //PIN
              String pin = null;
              System.out.println("Operation: PIN(string x)");
              System.out.println("Enter value of x (Pin)");
              pin = scan.next();
              atmTWO.PIN(pin);
              break;
            }
            case 3: {  //DEPOSIT
              float dAmount = 0;
              System.out.println("Operation: DEPOSIT(float d)");
              System.out.println("Enter value of d (Amount to deposit)");
              dAmount = scan.nextFloat();
              atmTWO.DEPOSIT(dAmount);
              break;
            }
            case 4: {  //WITHDRAW
              float wAmount = 0;
              System.out.println("Operation: WITHDRAW(float w)");
              System.out.println("Enter value of w (Amount to withdraw)");
              wAmount = scan.nextFloat();
              atmTWO.WITHDRAW(wAmount);
              break;
            }
            case 5: {  //BALANCE
              System.out.println("Operation: BALANCE() selected");
              atmTWO.BALANCE();
              break;
            }
            case 6: {  //EXIT
              input = false;
              System.out.println("Operation: EXIT() selected");
              atmTWO.EXIT();
              break;
            }
            default : {
              break;
            }
        }
      } //while
    } //doTest

}  //TestATM2


public class TestMDAOFATM {
  private ATMSystemClasses atmClasses;
  private TestATM1 atmONETest;
  private TestATM2 atmTWOTest;
  private static TestMDAOFATM atmMDATest;
  int atmType = 0;
  
  public TestMDAOFATM() {
    run();
  }

  public static void main(String[] args) {
    atmMDATest = new TestMDAOFATM();
  }

  void run() {
    Scanner scan = new Scanner(System.in);
    //Get ATM selection from User
    System.out.println("Select the choice to ATM from the given options (Please enter 1 0r 2)");
    System.out.println("1. ATM-1");
    System.out.println("2. ATM-2");
    atmType = scan.nextInt();

    atmClasses = new ATMSystemClasses();

    if(atmType == 1) {
      atmONETest = new TestATM1(atmClasses);
    }
    else {
      atmTWOTest = new TestATM2(atmClasses);
    }
  }

}
