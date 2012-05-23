/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public class ATMTwoCredit extends Credit {
  private float _amount;

  ATMTwoCredit(ATMSystemClasses aSC) {
    _amount = 0;
    dataAccess = aSC;
  }

  void storeCredit() {
    _amount = dataAccess.getATMTwoData().getCredit();
  }

  float getCredit() {
    return _amount;
  }




}
