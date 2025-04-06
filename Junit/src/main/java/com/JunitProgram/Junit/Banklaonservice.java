package com.JunitProgram.Junit;

public class Banklaonservice {
	  public double calcSimpleIntrestAmount(double pAmount,double rate,double time) {
			  System.out.println("BankLoanService.calcSimpleIntrestAmount()");
			  return pAmount*rate*time/100.0f;
  }
}