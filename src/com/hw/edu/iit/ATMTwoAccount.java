/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public class ATMTwoAccount extends Account {

  ATMTwoPin actPIN;
  ATMTwoBalance actBALANCE;
  
  ATMTwoAccount(ATMSystemClasses aSC) {
    actPIN = null;
    actBALANCE = null;
    dataAccess = aSC;
  }

  void makeDeposit(Credit c) {
    float cAmount = ((ATMTwoCredit)c).getCredit();
    actBALANCE.applyCredit(cAmount);
  }

  void makeWithdraw(Debit d) {
    float dAmount = ((ATMTwoDebit)d).getDebit();
    actBALANCE.applyDebit(dAmount);
  }

  void applyPenalty(Penalty p) {
    int pAmount = ((ATMTwoPenalty)p).getPenalty();
    actBALANCE.applyDebit(pAmount);
  }

  void storeBalance() {
    actBALANCE.storeBalance();
  }

  void storePin() {
    actPIN.storePin();
  }

  void promptForPin() {
    actPIN.promptForPin();
  }

  void incorrectPinPromptForPin() {
    actPIN.incorrectPinPromptForPin();
  }

  void incorrectPinMaxAttemptsExceeded() {
    actPIN.incorrectPinMaxAttemptsExceeded();
  }

  void displayBalance() {
    actBALANCE.displayBalance();
  }

  void setCompBalance(Balance b) {
    this.actBALANCE = (ATMTwoBalance)b;
  }

  void setCompPin(Pin p) {
    this.actPIN = (ATMTwoPin)p;
  }

 

}
