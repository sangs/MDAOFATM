/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public abstract class Account {

  ATMSystemClasses dataAccess;

  Account() {
   
  }

  abstract void makeDeposit(Credit c);
  abstract void makeWithdraw(Debit d);
  abstract void applyPenalty(Penalty p);
  abstract void storeBalance();
  abstract void storePin();
  abstract void promptForPin();
  abstract void incorrectPinPromptForPin();
  abstract void incorrectPinMaxAttemptsExceeded();
  abstract void displayBalance();
  abstract void setCompBalance(Balance b);
  abstract void setCompPin(Pin p);

  void setCompLkUnLk(LockUnlock lu) {

  }

  void show_locked_message() {

  }

  void show_unlocked_message() {

  }

  void perform_lock() {

  }

  void perform_unlock() {
      
  }

}
