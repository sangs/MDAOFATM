/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public class Ready extends ATMState {

  Ready() {

  }

  void deposit(CardStateTransitions st) {
    st.setStateTo(st.CARD_CKBAL_STATE);
  }

  void balance(CardStateTransitions st) {
    //Remains in the same state
  }

  void withdraw(CardStateTransitions st) {
    st.setStateTo(st.CARD_CKBAL_STATE);
  }

  void lock(CardStateTransitions st) {
    st.setStateTo(st.CARD_LOCK_STATE);
  }

  void exit(CardStateTransitions st) {
    st.setStateTo(st.CARD_IDLE_STATE);
  }

 

}
