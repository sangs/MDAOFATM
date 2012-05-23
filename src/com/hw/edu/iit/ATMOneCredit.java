/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public class ATMOneCredit extends Credit {

  private int _amount;

  ATMOneCredit(ATMSystemClasses aSC) {
    _amount = 0;
    dataAccess = aSC;
  }
  
  void storeCredit() {
    _amount = dataAccess.getATMOneData().getCredit();
  }

  int getCredit() {
    return _amount;
  }



}
