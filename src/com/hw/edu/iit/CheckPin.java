/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public class CheckPin extends ATMState {
  final static String ENTER_PIN_TO_PROCEED="Please enter pin to proceed";

  CheckPin() {

  }

  void correctPinBelowMin(CardStateTransitions st) {
    st.setStateTo(st.CARD_OVERDRAWN_STATE);
  }

  void correctPinAboveMin(CardStateTransitions st) {
    st.setStateTo(st.CARD_READY_STATE);
  }

  void incorrectPin(int maxAttempts, CardStateTransitions st) {
    //remains in the CheckPin state
  }

  void incorrectPinMaxAttemptsExceeded(CardStateTransitions st) {
    st.setStateTo(st.CARD_IDLE_STATE);
  }

  ////// Unsupported operations at this state //////
  
  void withdraw(CardStateTransitions st) {
    System.out.println(ENTER_PIN_TO_PROCEED);
    throw new UnsupportedOperationException(st.OPERATION_NOT_SUPPORTED);
  }

  void deposit(CardStateTransitions st) {
    System.out.println(ENTER_PIN_TO_PROCEED);
    throw new UnsupportedOperationException(st.OPERATION_NOT_SUPPORTED);
  }

  void balance(CardStateTransitions st) {
    System.out.println(ENTER_PIN_TO_PROCEED);
    throw new UnsupportedOperationException(st.OPERATION_NOT_SUPPORTED);
  }

  void lock(CardStateTransitions st) {
    System.out.println(ENTER_PIN_TO_PROCEED);
    throw new UnsupportedOperationException(st.OPERATION_NOT_SUPPORTED);
  }

  void unlock(CardStateTransitions st) {
    System.out.println(ENTER_PIN_TO_PROCEED);
    throw new UnsupportedOperationException(st.OPERATION_NOT_SUPPORTED);
  }

  void exit(CardStateTransitions st) {
    System.out.println(ENTER_PIN_TO_PROCEED);
    throw new UnsupportedOperationException(st.OPERATION_NOT_SUPPORTED);
  }


}
