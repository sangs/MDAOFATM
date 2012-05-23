/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public class ATMOneAccessor extends ATMAccessFactory {

  ATMSystemClasses aSC;

  ATMOneAccessor(ATMSystemClasses userDataAccess) {
    aSC = userDataAccess;
  }

  Pin getComponentPin() {
    return new ATMOnePin(aSC);
  }

  Balance getComponentBalance() {
    return new ATMOneBalance(aSC);
  }

  Menu getComponentMenu() {
    return new ATMOneMenu(aSC);
  }

  Account getComponentAccount() {
    return new ATMOneAccount(aSC);
  }

  Credit getComponentCredit() {
    return new ATMOneCredit(aSC);
  }

  Debit getComponentDebit() {
    return new ATMOneDebit(aSC);
  }

  Penalty getComponentPenalty() {
  return new ATMOnePenalty(aSC);
  }

  Card getComponentCard() {
    return new ATMOneCard(aSC);
  }

  LockUnlock getComponentLKUNLK() {
       return new ATMOneLockUnlock(aSC);
  }

  Overdrawn getComponentOverdrawn() {
    return new ATMOneOverdrawn(aSC);
  }

}
