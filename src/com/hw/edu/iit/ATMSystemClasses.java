/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public class ATMSystemClasses {

  private ATMProcessing atmProcessor;
  private ATMEFSM atmModel;

  private ATMSystem theATMSystem;
  private ATMSystemTwo theATMSystemTwo;
  private ATMOneData atmOneData;
  private ATMTwoData atmTwoData;

  //private ATMSystemTwo theATMSystemTwo;
  //private ATMTwoData atmTwoData;
   
  public ATMSystemClasses() {
    atmProcessor = null;
    atmModel = null;
    theATMSystem = null;
    theATMSystemTwo = null;
    atmOneData = null;
    atmTwoData = null;
  }

  public ATMSystem getATMSystemOne() {
    int type = 0;

    //Create ATM EFSM Model
    atmModel = new ATMEFSM();

    //Create concrete instance of ATMONE System
    ATMOne atmImpl = new ATMOne();

    //ATMONE interacts with this model
    atmImpl.setModel(atmModel);

    //Data class that will be used by ATM input & output processors
    atmOneData = atmImpl.getData();

    //Create ATM output processor and set access to Data class
    atmProcessor = new ATMProcessing();
    atmProcessor.setDataAccess(this);

    //Initialize the ATM EFSM model
    type = atmImpl.getAtmType();
    atmModel.initialize(type, atmProcessor);

    //Return the ATM One instance to the User
    theATMSystem = atmImpl;
    return theATMSystem;
  }

   public ATMSystemTwo getATMSystemTwo() {
    int type = 0;

    //Create ATM EFSM Model
    atmModel = new ATMEFSM();

    //Create concrete instance of ATMONE System
    ATMTwo atmImpl = new ATMTwo();

    //ATMONE interacts with this model
    atmImpl.setModel(atmModel);

    //Data class that will be used by ATM input & output processors
    atmTwoData = atmImpl.getData();

    //Create ATM output processor and set access to Data class
    atmProcessor = new ATMProcessing();
    atmProcessor.setDataAccess(this);

    //Initialize the ATM EFSM model
    type = atmImpl.getAtmType();
    atmModel.initialize(type, atmProcessor);

    //Return the ATM One instance to the User
    theATMSystemTwo = atmImpl;
    return theATMSystemTwo;
  }

  public ATMProcessing getATMProcessor() {
    return atmProcessor;
  }

  public ATMEFSM getATMModel() {
    return atmModel;
  }

  public ATMOneData getATMOneData() {
    return atmOneData;
  }

  public ATMTwoData getATMTwoData() {
    return atmTwoData;
  }

}

