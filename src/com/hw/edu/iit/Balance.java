/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public abstract class Balance {

  ATMSystemClasses dataAccess;
 
  Balance() {
    
  }

  abstract void storeBalance();
  abstract void displayBalance();
   
}
