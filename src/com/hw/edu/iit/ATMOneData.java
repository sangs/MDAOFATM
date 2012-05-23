/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public class ATMOneData {

  private int balance;
  private int pin;
  private int credit;
  private int debit;
  private int penalty;
  private static int ATMONE_PENALTY = 1;
  private static int MINIMUM_BALANCE = 100;
  private static int MAX_POSSIBLE_ATTEMPTS = 2;

  ATMOneData() {
    penalty = ATMONE_PENALTY;
  }

  public void storeBalance(int b) {
    balance = b;
  }

  public void storePin(int p) {
    pin = p;
  }

  public void storeCredit(int cr) {
    credit = cr;
  }

  public void storeDebit(int db) {
    debit = db;
  }

  public void storePenalty(int p) {
    penalty = p;
  }

  public int getPin() {
      return pin;
  }

  public int getBalance() {
      return balance;
  }

  public int getCredit() {
      return credit;
  }

  public int getDebit() {
      return debit;
  }

  public int getPenalty() {
      return penalty;
  }

  public int getMinBalance() {
    return MINIMUM_BALANCE;
  }

  public int getMaxAttemptsAllowed() {
      return MAX_POSSIBLE_ATTEMPTS;
  }

}
