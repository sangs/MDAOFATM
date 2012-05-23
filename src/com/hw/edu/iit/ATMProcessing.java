/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public class ATMProcessing {

  private Menu accntMenu;
  private Account account;
  private Credit accntCredit;
  private Debit accntDebit;
  private Penalty accntPenalty;
  private Card accntCard;
  private Overdrawn accntOverDrawn;
  private ATMAccessServer atmAccessor;
  private ATMSystemClasses dataAccess;

  ATMProcessing() {
    account = null;
    accntMenu = null;
    accntCredit = null;
    accntDebit = null;
    accntPenalty = null;
    accntCard = null;
    atmAccessor = null;
    dataAccess = null;
  }

  public void do_initialize(int type) {
    atmAccessor = new ATMAccessServer();
    atmAccessor.initialize(type, dataAccess);
    
  }

  public void storeBalance() {
    if(account != null)
      account.storeBalance();
  }

  public void storePin() {
    if(account != null)
      account.storePin();
  }

  public void promptForPin() {
    if(account != null)
      account.promptForPin();
  }

  public void show_overdrawn_message() {
    if (accntOverDrawn == null) {
      accntOverDrawn = atmAccessor.OverdrawnComponent();
    }
    accntOverDrawn.show_overdrawn_message();
  }

  public void display_menu() {
    if (accntMenu == null) {
      accntMenu = atmAccessor.MenuComponent();
    }
    accntMenu.display_menu();
  }

  public void incorrectPinPromptForPin() {
    if(account != null)
      account.incorrectPinPromptForPin();
  }

  public void incorrectPinMaxAttemptsExceeded() {
    if(account != null)
      account.incorrectPinMaxAttemptsExceeded();
  }

  public void storeCredit() {
    if (accntCredit == null) {
      accntCredit = atmAccessor.CreditComponent();
    }
    accntCredit.storeCredit();
  }

  public void makeDeposit() {
    if(account != null)
      account.makeDeposit(accntCredit);
  }

  public void storePenalty() {
    if (accntPenalty == null) {
      accntPenalty = atmAccessor.PenaltyComponent();
    }
    accntPenalty.storePenalty();
  }

  public void applyPenalty() {
    if(account != null)
      account.applyPenalty(accntPenalty);
  }

  public void storeDebit() {
    if (accntDebit == null) {
      accntDebit = atmAccessor.DebitComponent();
    }
    accntDebit.storeDebit();
  }

  public void makeWithdraw() {
    if(account != null)
      account.makeWithdraw(accntDebit);
  }

  public void displayBalance() {
    if(account != null)
      account.displayBalance();
  }

  public void perform_lock() {
    if(account != null)
      account.perform_lock();
  }

  public void show_locked_message() {
    if(account != null)
      account.show_locked_message();
  }

  public void perform_unlock() {
    if(account != null)
      account.perform_unlock();
  }

  public void show_unlocked_message() {
    if(account != null)
      account.show_unlocked_message();
  }

  public void init_card() {
    if(accntCard == null)
      accntCard = atmAccessor.CardComponent();
    if(account == null) {
      account = atmAccessor.AccountComponent();
      account.setCompBalance(atmAccessor.BalanceComponent());
      account.setCompPin(atmAccessor.PinComponent());
      account.setCompLkUnLk(atmAccessor.LockUnlockComponent());

    }
  }

  public void ejectCard() {
    if(accntCard != null)
      accntCard.ejectCard();
  }

  public void setDataAccess(ATMSystemClasses atmSC) {
    dataAccess = atmSC;
  }

  public ATMSystemClasses getDataAccess() {
    return dataAccess;
  }

  
}
