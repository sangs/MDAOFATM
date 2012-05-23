/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public class Lock extends ATMState {

  final static String CANNOT_WITHDRAW = "Account is locked. Cannot proceed to withdraw";
  final static String CANNOT_DEPOSIT = "Account is locked. Cannot proceed to deposit";

  Lock() {

  }

  void unlock(CardStateTransitions st) {
    st.setStateTo(st.CARD_ACTIVATE_STATE);
  }

  void withdraw(CardStateTransitions st) {
    System.out.println(CANNOT_WITHDRAW);
    throw new UnsupportedOperationException(st.OPERATION_NOT_SUPPORTED);
  }

  void deposit(CardStateTransitions st) {
    System.out.println(CANNOT_DEPOSIT);
    throw new UnsupportedOperationException(st.OPERATION_NOT_SUPPORTED);
  }

}
