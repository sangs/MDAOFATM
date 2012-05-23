/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public class AccountOverdrawn extends ATMState {

  final static String CANNOT_WITHDRAW = "Unable to withdraw. Account has been Overdrawn !";

  AccountOverdrawn() {

  }

  void balance(CardStateTransitions st) {
    //Remains in the same state
  }

  void deposit(CardStateTransitions st) {
    st.setStateTo(st.CARD_CKBAL_STATE);
  }

  void exit(CardStateTransitions st) {
    st.setStateTo(st.CARD_IDLE_STATE);
  }

  void withdraw(CardStateTransitions st) {
    System.out.println(CANNOT_WITHDRAW);
    throw new UnsupportedOperationException(st.OPERATION_NOT_SUPPORTED);
  }

    
}
