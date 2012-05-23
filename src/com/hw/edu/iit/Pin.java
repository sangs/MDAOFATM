/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public abstract class Pin {

  ATMSystemClasses dataAccess;

  Pin() {
      
  }

  abstract void storePin();
  abstract void promptForPin();
  abstract void incorrectPinPromptForPin();
  abstract void incorrectPinMaxAttemptsExceeded();

}
