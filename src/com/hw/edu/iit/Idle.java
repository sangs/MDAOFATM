/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public class Idle extends ATMState {
  final static String INSERT_CARD_TO_PROCEED="Please insert card to proceed";

  Idle() {

  }

  void card(CardStateTransitions st) {
    st.setStateTo(st.CARD_CKPIN_STATE);
  }

   ////// Unsupported operations at this state //////

  void deposit(CardStateTransitions st) {
    System.out.println(INSERT_CARD_TO_PROCEED);
    throw new UnsupportedOperationException(st.OPERATION_NOT_SUPPORTED);
  }

  void withdraw(CardStateTransitions st) {
    System.out.println(INSERT_CARD_TO_PROCEED);
    throw new UnsupportedOperationException(st.OPERATION_NOT_SUPPORTED);
  }

  void balance(CardStateTransitions st) {
    System.out.println(INSERT_CARD_TO_PROCEED);
    throw new UnsupportedOperationException(st.OPERATION_NOT_SUPPORTED);
  }

  void lock(CardStateTransitions st) {
    System.out.println(INSERT_CARD_TO_PROCEED);
    throw new UnsupportedOperationException(st.OPERATION_NOT_SUPPORTED);
  }

  void unlock(CardStateTransitions st) {
    System.out.println(INSERT_CARD_TO_PROCEED);
    throw new UnsupportedOperationException(st.OPERATION_NOT_SUPPORTED);
  }

  void exit(CardStateTransitions st) {
      //state remains unchanged
  }

}
