/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public class ATMOneDebit extends Debit {

  private int _amount;

  ATMOneDebit(ATMSystemClasses aSC) {
    dataAccess = aSC;
  }

  void storeDebit() {
    _amount = dataAccess.getATMOneData().getDebit();
  }

  int getDebit() {
    return _amount;
  }

}
