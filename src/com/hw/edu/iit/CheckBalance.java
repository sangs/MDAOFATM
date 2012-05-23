/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public class CheckBalance extends ATMState {

  CheckBalance() {

  }

  void balanceBelowMin(CardStateTransitions st) {
    st.setStateTo(st.CARD_OVERDRAWN_STATE);
  }

  void balanceAboveMin(CardStateTransitions st) {
    st.setStateTo(st.CARD_READY_STATE);
  }

  void exit(CardStateTransitions st) {

  }
  
}
