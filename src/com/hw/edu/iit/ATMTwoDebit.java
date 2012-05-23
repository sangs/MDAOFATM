/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public class ATMTwoDebit extends Debit {
  private float _amount;

  ATMTwoDebit(ATMSystemClasses aSC) {
    dataAccess = aSC;
  }

  void storeDebit() {
    _amount = dataAccess.getATMTwoData().getDebit();
  }

  float getDebit() {
    return _amount;
  }


}
