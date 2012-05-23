/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public class ATMState {

    ATMState() {

    }

    void card(CardStateTransitions st) {
      throw new UnsupportedOperationException(st.OPERATION_NOT_SUPPORTED);
    }

    void correctPinBelowMin(CardStateTransitions st) {
      throw new UnsupportedOperationException(st.OPERATION_NOT_SUPPORTED);
    }

    void correctPinAboveMin(CardStateTransitions st) {
      throw new UnsupportedOperationException(st.OPERATION_NOT_SUPPORTED);
    }

    void incorrectPin(int maxAttempts, CardStateTransitions st) {
      throw new UnsupportedOperationException(st.OPERATION_NOT_SUPPORTED);
    }

    void incorrectPinMaxAttemptsExceeded(CardStateTransitions st) {
       throw new UnsupportedOperationException(st.OPERATION_NOT_SUPPORTED);
    }

    void deposit(CardStateTransitions st) {
      throw new UnsupportedOperationException(st.OPERATION_NOT_SUPPORTED);
    }

    void balanceBelowMin(CardStateTransitions st) {
      throw new UnsupportedOperationException(st.OPERATION_NOT_SUPPORTED);
    }

    void balanceAboveMin(CardStateTransitions st) {
      throw new UnsupportedOperationException(st.OPERATION_NOT_SUPPORTED);
    }

    void withdraw(CardStateTransitions st) {
      throw new UnsupportedOperationException(st.OPERATION_NOT_SUPPORTED);
    }

    void balance(CardStateTransitions st) {
      throw new UnsupportedOperationException(st.OPERATION_NOT_SUPPORTED);
    }

    void lock(CardStateTransitions st) {
      throw new UnsupportedOperationException(st.OPERATION_NOT_SUPPORTED);
    }

    void unlock(CardStateTransitions st) {
      throw new UnsupportedOperationException(st.OPERATION_NOT_SUPPORTED);
    }

    void exit(CardStateTransitions st) {
      throw new UnsupportedOperationException(st.OPERATION_NOT_SUPPORTED);
    }


}
