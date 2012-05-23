/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public abstract class LockUnlock {

  ATMSystemClasses dataAccess;

  LockUnlock() {
      
  }

  abstract void perform_lock();
  abstract void perform_unlock();
  abstract void show_locked_message();
  abstract void show_unlocked_message();

}
