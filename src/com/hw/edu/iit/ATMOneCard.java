/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public class ATMOneCard extends Card {

  ATMOneCard(ATMSystemClasses aSC) {
    dataAccess = aSC;
  }

  void init_card() {
    System.out.println("Verifying Card information...");
  }

  void ejectCard() {
    System.out.println("Card being ejected");
  }


}
