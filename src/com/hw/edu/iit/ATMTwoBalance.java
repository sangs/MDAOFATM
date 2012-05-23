/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public class ATMTwoBalance extends Balance {

  private float _balance;

  ATMTwoBalance(ATMSystemClasses aSC) {
    _balance = 0;
     dataAccess = aSC;
  }

  void storeBalance() {
    _balance = dataAccess.getATMTwoData().getBalance();
  }

  void displayBalance() {
    System.out.println("Account Balance: " + _balance);
  }

  void applyCredit(float a) {
    _balance += a;
    dataAccess.getATMTwoData().storeBalance(_balance);
  }

  void applyDebit(float a) {
    _balance -= a;
    dataAccess.getATMTwoData().storeBalance(_balance);
  }


}
