/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public class ATMTwoAccessor extends ATMAccessFactory {

  ATMSystemClasses aSC;

  ATMTwoAccessor(ATMSystemClasses userDataAccess) {
    aSC = userDataAccess;
  }

  Pin getComponentPin() {
    return new ATMTwoPin(aSC);
  }

  Balance getComponentBalance() {
    return new ATMTwoBalance(aSC);
  }

  Menu getComponentMenu() {
    return new ATMTwoMenu(aSC);
  }

  Account getComponentAccount() {
    return new ATMTwoAccount(aSC);
  }

  Credit getComponentCredit() {
    return new ATMTwoCredit(aSC);
  }

  Debit getComponentDebit() {
    return new ATMTwoDebit(aSC);
  }

  Penalty getComponentPenalty() {
  return new ATMTwoPenalty(aSC);
  }

  Card getComponentCard() {
    return new ATMTwoCard(aSC);
  }

  Overdrawn getComponentOverdrawn() {
    return new ATMTwoOverdrawn(aSC);
  }

}
