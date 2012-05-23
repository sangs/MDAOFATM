/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public class ATMOne implements ATMSystem {

    private ATMEFSM atmModel;
    private ATMOneData data;
    private static final int atmType = 1;


    ATMOne() {
      atmModel = null;
      data = new ATMOneData();
    }

    public void card(int x, int y) {
      if(atmModel != null) {
        data.storeBalance(x);
        data.storePin(y);
        atmModel.card();
      }
    }

    public void pin(int x) {
      int pinData = data.getPin();
      int minBal = data.getMinBalance();
      int bal = data.getBalance();

      if(atmModel != null) {
        if (pinData == x) {
          if (bal < minBal)
            atmModel.correctPinBelowMin();
          else
            atmModel.correctPinAboveMin();
        }
        else {
          atmModel.incorrectPin(data.getMaxAttemptsAllowed());
        }
      }
    }

    public void deposit(int d) {
      int minBal = data.getMinBalance();
      int bal;

      if(atmModel != null) {
        data.storeCredit(d);
        atmModel.deposit();
        bal = data.getBalance();
        if (bal < minBal)
          atmModel.balanceBelowMin();
        else
          atmModel.balanceAboveMin();
      }
    }

    public void withdraw(int w) {
      int minBal = data.getMinBalance();
      int bal;

      if(atmModel != null) {
        data.storeDebit(w);
        atmModel.withdraw();
        bal = data.getBalance();
        if (bal < minBal)
          atmModel.balanceBelowMin();
        else
          atmModel.balanceAboveMin();
      }
    }

    public void balance() {
      if(atmModel != null)
        atmModel.balance();
    }

    public void lock(int x) {
      int sPin = 0;
      if(atmModel != null) {
        if ((sPin = data.getPin()) == x)
          atmModel.lock();
      }

    }

    public void unlock(int x) {
      int minBal = data.getMinBalance();
      int bal, sPin;

      if(atmModel != null) {
        if ((sPin = data.getPin()) == x) {
          atmModel.unlock();
          if( (bal = data.getBalance()) < minBal )
            atmModel.unlockBalanceBelowMin();
          else
            atmModel.unlockBalanceAboveMin();
        }
      }
    }

    public void exit() {
      if(atmModel != null)
        atmModel.exit();
    }

    public int getAtmType() {
        return atmType;
    }

    public ATMOneData getData() {
        return data;
    }

    public ATMEFSM getModel() {
        return atmModel;
    }

    public void setModel(ATMEFSM model) {
      atmModel = model;
    }


}
