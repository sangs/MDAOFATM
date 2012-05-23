/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hw.edu.iit;

/**
 *
 * @author Owner
 */
public interface ATMSystem {

    public void card(int x, int y);

    public void pin(int x);

    public void deposit(int d);

    public void withdraw(int w);

    public void balance();

    public void lock(int x);

    public void unlock(int x);

    public void exit();

}
