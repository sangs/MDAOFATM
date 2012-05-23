/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public class ATMOneLockUnlock extends LockUnlock {

  private boolean isLocked;

  ATMOneLockUnlock (ATMSystemClasses aSC) {
    isLocked = false;
    dataAccess = aSC;
  }

  void perform_lock() {
    this.isLocked = true;
  }

  void perform_unlock() {
    this.isLocked = false;
  }

  void show_locked_message() {
    System.out.println("Account has been locked");
  }

  void show_unlocked_message() {
    System.out.println("Account has been unlocked");
  }


}
