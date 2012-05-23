/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public class ATMTwo implements ATMSystemTwo {

    private ATMEFSM atmModel;
    private ATMTwoData data;
    private static final int atmType = 2;


    ATMTwo() {
      atmModel = null;
      data = new ATMTwoData();
    }

    public void CARD(float x, String y) {
      if(atmModel != null) {
        data.storeBalance(x);
        data.storePin(y);
        atmModel.card();
      }
    }

    public void PIN(String x) {
      String pinData = data.getPin();
      float minBal = data.getMinBalance();
      float bal = data.getBalance();

      if(atmModel != null) {
        if (pinData.compareTo(x) == 0) {
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

    public void DEPOSIT(float d) {
      float minBal = data.getMinBalance();
      float bal;

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

    public void WITHDRAW(float w) {
      float minBal = data.getMinBalance();
      float bal;

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

    public void BALANCE() {
      if(atmModel != null)
        atmModel.balance();
    }

    public void EXIT() {
      if(atmModel != null)
        atmModel.exit();
    }

    public int getAtmType() {
        return atmType;
    }

    public ATMTwoData getData() {
        return data;
    }

    public ATMEFSM getModel() {
        return atmModel;
    }

    public void setModel(ATMEFSM model) {
      atmModel = model;
    }


}
