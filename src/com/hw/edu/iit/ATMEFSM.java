/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public class ATMEFSM implements CardStateTransitions {

    private int noOfAttempts;
    private ATMState currState;
    private ATMProcessing processor;
    private int atm_type;

    ATMEFSM() {
      noOfAttempts = 0;
      atm_type = 0;
      currState = null;
      processor = null;
    }

    public void setStateTo(ATMState state) {
      currState = state;
    }

    public void card() {
      try {
      //Manage State
      currState.card(this);

      //Invoke output processor
      processor.init_card();
      processor.storeBalance();
      processor.storePin();
      processor.promptForPin();
      }
      catch(Exception e) {
        //unsupported operation
        System.out.println(this.OPERATION_NOT_SUPPORTED);
      }

    }

    public void correctPinBelowMin() {
      try {
      //Manage State
      currState.correctPinBelowMin(this);

      //Invoke output processor
      processor.show_overdrawn_message();
      processor.display_menu();
      }
      catch(Exception e) {
        //unsupported operation
        System.out.println(this.OPERATION_NOT_SUPPORTED);
      }

    }

    public void correctPinAboveMin() {
      try {
      //Manage State
      currState.correctPinAboveMin(this);

      //Invoke output processor
      processor.display_menu();
      }
      catch(Exception e) {
        //unsupported operation
        System.out.println(this.OPERATION_NOT_SUPPORTED);
      }

    }

    public void incorrectPin(int maxAttempts) {
      try {
      noOfAttempts++;
      if (noOfAttempts < maxAttempts) {
        currState.incorrectPin(maxAttempts, this);
        processor.incorrectPinPromptForPin();
      }
      else {
        currState.incorrectPinMaxAttemptsExceeded(this);
        processor.incorrectPinMaxAttemptsExceeded();
        processor.ejectCard();
      }
      }
      catch(Exception e) {
        //unsupported operation
        System.out.println(this.OPERATION_NOT_SUPPORTED);
      }

    }

    public void deposit() {
      try {
      currState.deposit(this);
      processor.storeCredit();
      processor.makeDeposit();
      }
      catch(Exception e) {
        //unsupported operation
      }
    }

    public void balanceBelowMin() {
      try {
      currState.balanceBelowMin(this);
      processor.storePenalty();
      processor.applyPenalty();
      processor.show_overdrawn_message();
      processor.display_menu();
      }
      catch(Exception e) {
        //unsupported operation
      }
    }

    public void balanceAboveMin() {
      try {
      currState.balanceAboveMin(this);
      processor.display_menu();
      }
      catch(Exception e) {
        //unsupported operation
      }
    }

    public void unlockBalanceBelowMin() {
      try {
      currState.balanceBelowMin(this);
      processor.show_overdrawn_message();
      processor.display_menu();
      }
      catch(Exception e) {
        //unsupported operation
      }
    }

    public void unlockBalanceAboveMin() {
      try {
      currState.balanceAboveMin(this);
      processor.display_menu();
      }
      catch(Exception e) {
        //unsupported operation
      }
    }

    public void withdraw() {
      try {
      currState.withdraw(this);
      processor.storeDebit();
      processor.makeWithdraw();
      }
      catch(Exception e) {
        //unsupported operation
      }
    }

    public void balance() {
      try {
      currState.balance(this);
      processor.displayBalance();
      processor.display_menu();
      }
      catch(Exception e) {
        //unsupported operation
        System.out.println(this.OPERATION_NOT_SUPPORTED);
      }
    }

    public void lock() {
      try {
      currState.lock(this);
      processor.perform_lock();
      processor.show_locked_message();
      processor.display_menu();
      }
      catch(Exception e) {
        //unsupported operation
      }
    }

    public void unlock() {
      try {
      currState.unlock(this);
      processor.perform_unlock();
      processor.show_unlocked_message();
      }
      catch(Exception e) {
        //unsupported operation
      }
    }

    public void exit() {
      try {
      currState.exit(this);
      processor.ejectCard();
      }
      catch(Exception e) {
        //unsupported operation
        System.out.println(this.OPERATION_NOT_SUPPORTED);
      }
    }

    public void initialize(int type, ATMProcessing atmOP) {
      noOfAttempts = 0;
      currState = CardStateTransitions.CARD_IDLE_STATE;
      atm_type = type;
      processor = atmOP;
      processor.do_initialize(type);
    }

}
