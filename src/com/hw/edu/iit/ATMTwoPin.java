/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public class ATMTwoPin extends Pin {
  private ATMTwoData data;
  private String _pin;
  final String PROMPT_FOR_PIN = "Please enter PIN to access the account";
  final String INCORRECT_PIN_PROMPTFORPIN = "Incorrect Pin. Please try again";
  final String INCORRECT_PIN_MAXATTEMPTS_EXCEEDED = "Incorrect Pin. Exceeded Maximum attempts";

  ATMTwoPin(ATMSystemClasses aSC) {
    dataAccess = aSC;
    data = dataAccess.getATMTwoData();
  }

  void storePin() {
    _pin = data.getPin();
  }

  void promptForPin() {
    System.out.println(PROMPT_FOR_PIN);
  }

  void incorrectPinPromptForPin() {
    System.out.println(INCORRECT_PIN_PROMPTFORPIN);
  }

  void incorrectPinMaxAttemptsExceeded() {
    System.out.println(INCORRECT_PIN_MAXATTEMPTS_EXCEEDED);
  }

  String getPin() {
    return _pin;
  }

}
