package org.booleancareer.java;

public class FizzBuzz {
	
	 public static void main(String[] args){
	        for(int i = 1; i <= 100; i++){
	            
	        	//per multipli di 3 e 5 stampo FizzBuzz
	        	if (i % 3 == 0 && i % 5 == 0){
	                System.out.println("FizzBuzz");
	             
	                //per multipli di 3 stampo Fizz   
	            }else if (i % 3 == 0){
	                System.out.println("Fizz");
	            
	                //per multipli di 5 stampo Buzz
	            }else if (i % 5 == 0){
	                System.out.println("Buzz");
	            
	                //per il restante stampo il valore corrente
	            }else{
	                System.out.println(i);
	            }
	        }
	    }
	}



