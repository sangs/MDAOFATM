/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public class ATMOnePenalty extends Penalty {

  int _penalty;

  ATMOnePenalty(ATMSystemClasses aSC) {
    _penalty = 0;
    dataAccess = aSC;
  }
  
  void storePenalty() {
    _penalty = dataAccess.getATMOneData().getPenalty();
  }

  int getPenalty() {
    return _penalty;
  }

}
