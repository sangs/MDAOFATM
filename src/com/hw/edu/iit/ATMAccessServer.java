/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public class ATMAccessServer {
  private final static int ATM_ONE = 1;
  private final static int ATM_TWO = 2;
  private ATMAccessFactory atmFactory;

  ATMAccessServer() {
    atmFactory = null;
  }

  void initialize(int type, ATMSystemClasses aSC) {
    if (type == ATM_ONE) {
      if (atmFactory == null)
        atmFactory = new ATMOneAccessor(aSC);
    }
    else {
      if (atmFactory == null)
        atmFactory = new ATMTwoAccessor(aSC);
    }
  }

  Pin PinComponent() {
    return atmFactory.getComponentPin();
  }

  Balance BalanceComponent() {
    return atmFactory.getComponentBalance();
  }

  Menu MenuComponent() {
    return atmFactory.getComponentMenu();
  }

  Card CardComponent() {
    return atmFactory.getComponentCard();
  }

  Account AccountComponent() {
    return atmFactory.getComponentAccount();
  }

  Credit CreditComponent() {
    return atmFactory.getComponentCredit();
  }

  Debit DebitComponent() {
    return atmFactory.getComponentDebit();
  }

  Penalty PenaltyComponent() {
    return atmFactory.getComponentPenalty();
  }

  LockUnlock LockUnlockComponent() {
    return atmFactory.getComponentLKUNLK();
  }

  Overdrawn OverdrawnComponent() {
    return atmFactory.getComponentOverdrawn();
  }






}
