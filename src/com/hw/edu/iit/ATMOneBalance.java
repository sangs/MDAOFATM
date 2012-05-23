/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public class ATMOneBalance extends Balance {

  private int _balance;

  ATMOneBalance(ATMSystemClasses aSC) {
    _balance = 0;
     dataAccess = aSC;
  }

  void storeBalance() {
    _balance = dataAccess.getATMOneData().getBalance();
  }

  void displayBalance() {
    System.out.println("Account Balance: " + _balance);
  }

  void applyCredit(int a) {
    _balance += a;
    dataAccess.getATMOneData().storeBalance(_balance);
  }

  void applyDebit(int a) {
    _balance -= a;
    dataAccess.getATMOneData().storeBalance(_balance);
  }
    
}
