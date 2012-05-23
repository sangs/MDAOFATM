/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public abstract class Card {

  ATMSystemClasses dataAccess;

  Card() {
      
  }

  abstract void init_card();
  abstract void ejectCard();

}
