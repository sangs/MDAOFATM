/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public class ATMOneOverdrawn extends Overdrawn {

  ATMOneOverdrawn(ATMSystemClasses aSC) {
    dataAccess = aSC;
  }

  void show_overdrawn_message() {
    System.out.println("Account has been Overdrawn !");
  }

}
