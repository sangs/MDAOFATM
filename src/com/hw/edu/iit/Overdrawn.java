/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public abstract class Overdrawn {

  ATMSystemClasses dataAccess;

  Overdrawn() {
      
  }

  abstract void show_overdrawn_message();


}
