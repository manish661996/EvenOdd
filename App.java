package com.bridgelabz.EvenOdd;

import org.apache.logging.log4j.Logger;



import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger Log = LogManager.getLogger(App.class);
	private int Number;
	public static void main( String[] args )
	{
		// this section of the code will generate log file and print log message on console
		String message="Welcome ";
		Log.debug(message + " will be printed on Debug");
		Log.info(message + " Will be printed on info");
		Log.warn(message + " will be printed on warn");
		Log.error(message + " will be printed on error");
		Log.fatal(message + " will be printed on fatal");
		Log.info("Appending String: {}.", message);
		System.out.println(message);
		App a =new App();
		a.setNumber();
		a.isEvenOdd();
	}
	
	public void setNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of number");
		this.Number = sc.nextInt();
	}
	public int getNumber() {
		return this.Number;
	}
	
	public void isEvenOdd() {
		if((this.Number % 2) == 0) {
			System.out.println("Number : "+ this.Number + "  is even");
		}
		else {
			System.out.println("Number : "+ this.Number + "  is odd");
		}
	}
}
