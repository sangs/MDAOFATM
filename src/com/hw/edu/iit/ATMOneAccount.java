/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public class ATMOneAccount extends Account {

  ATMOnePin actPIN;
  ATMOneBalance actBALANCE;
  ATMOneLockUnlock actLKUNLK;
 
  ATMOneAccount(ATMSystemClasses aSC) {
    actPIN = null;
    actBALANCE = null;
    actLKUNLK = null;
    dataAccess = aSC;
  }

  void makeDeposit(Credit c) {
    int cAmount;
    ATMOneCredit aCredit = (ATMOneCredit)c;
    cAmount = aCredit.getCredit();
    actBALANCE.applyCredit(cAmount);
  }

  void makeWithdraw(Debit d) {
    int dAmount;
    ATMOneDebit aDebit = (ATMOneDebit)d;
    dAmount = aDebit.getDebit();
    actBALANCE.applyDebit(dAmount);
  }

  void applyPenalty(Penalty p) {
    int pAmount;
    ATMOnePenalty aPenalty = (ATMOnePenalty)p;
    pAmount = aPenalty.getPenalty();
    actBALANCE.applyDebit(pAmount);
  }

  @Override
  void perform_lock() {
    actLKUNLK.perform_lock();
  }

  @Override
  void perform_unlock() {
    actLKUNLK.perform_unlock();
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

    @Override
  void show_locked_message() {
    actLKUNLK.show_locked_message();
  }

    @Override
  void show_unlocked_message() {
    actLKUNLK.show_unlocked_message();
  }

  void setCompBalance(Balance b) {
    this.actBALANCE = (ATMOneBalance)b;
  }
  
  void setCompPin(Pin p) {
    this.actPIN = (ATMOnePin)p;
  }
  
    @Override
  void setCompLkUnLk(LockUnlock lu) {
    this.actLKUNLK = (ATMOneLockUnlock)lu;
  }


}
