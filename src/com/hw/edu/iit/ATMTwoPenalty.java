/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public class ATMTwoPenalty extends Penalty {
  int _penalty;

  ATMTwoPenalty(ATMSystemClasses aSC) {
    _penalty = 0;
    dataAccess = aSC;
  }

  void storePenalty() {
    _penalty = dataAccess.getATMTwoData().getPenalty();
  }

  int getPenalty() {
    return _penalty;
  }


}
