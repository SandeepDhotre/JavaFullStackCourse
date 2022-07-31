package com.ineuronpatterns;
/*
 * Prepared by Abinash K. Chaudhary for Ineuron Java Full Stack Course Assignment
 * Assignment 1
 * Solution to Question 4
 * 
 * */
public class FourthQuestion {
	//main method
	public static void main(String[] args) {
		int num = 14;
		boolean condition;
		
		//vertical counter
		for (int i=0; i < num; i++) {  
			//horizontal counter
			for (int j=0; j < num; j++) {
				//condition required to draw the shape
				condition = ( i-j >= (num-1)/2 || i+j >= num-1 + (num-1)/2);
				
				if (condition == true) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}
