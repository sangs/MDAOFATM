/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public abstract class ATMAccessFactory {

    ATMAccessFactory() {

    }

   abstract Pin getComponentPin();
   abstract Balance getComponentBalance();
   abstract Menu getComponentMenu();
   abstract Account getComponentAccount();
   abstract Credit getComponentCredit();
   abstract Debit getComponentDebit();
   abstract Penalty getComponentPenalty();
   abstract Card getComponentCard();
   LockUnlock getComponentLKUNLK() {
       return null;
   }
   abstract Overdrawn getComponentOverdrawn();


}
