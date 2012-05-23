/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public interface CardStateTransitions {

    public static final ATMState CARD_IDLE_STATE = new Idle();
    public static final ATMState CARD_CKPIN_STATE = new CheckPin();
    public static final ATMState CARD_CKBAL_STATE = new CheckBalance();
    public static final ATMState CARD_LOCK_STATE = new Lock();
    public static final ATMState CARD_READY_STATE = new Ready();
    public static final ATMState CARD_OVERDRAWN_STATE = new AccountOverdrawn();
    public static final ATMState CARD_ACTIVATE_STATE = new Activate();
    public static final String OPERATION_NOT_SUPPORTED = "This Operation is NOT supported at this state";

    public void setStateTo(ATMState state);

}
