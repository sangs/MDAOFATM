/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public class ATMTwoData {

  private float balance;
  private String pin;
  private float credit;
  private float debit;
  private int penalty;
  private static int ATMTWO_PENALTY = 10;
  private static float MINIMUM_BALANCE = 1000;
  private static int MAX_POSSIBLE_ATTEMPTS = 3;

  ATMTwoData() {
    penalty = ATMTWO_PENALTY;
  }

  public void storeBalance(float b) {
    balance = b;
  }

  public void storePin(String p) {
    pin = p;
  }

  public void storeCredit(float cr) {
    credit = cr;
  }

  public void storeDebit(float db) {
    debit = db;
  }

  public void storePenalty(int p) {
    penalty = p;
  }

  public String getPin() {
      return pin;
  }

  public float getBalance() {
      return balance;
  }

  public float getCredit() {
      return credit;
  }

  public float getDebit() {
      return debit;
  }

  public int getPenalty() {
      return penalty;
  }

  public float getMinBalance() {
    return MINIMUM_BALANCE;
  }

  public int getMaxAttemptsAllowed() {
      return MAX_POSSIBLE_ATTEMPTS;
  }


}
