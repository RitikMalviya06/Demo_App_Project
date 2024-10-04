package Number_Java_Program;

import java.util.Scanner;

public class Prime_Number {
//	public static void main(String[] args) {
//		Scanner Scanner = new Scanner(System.in);
//		// Input from user 
//		System.out.println("Enter a number ");
//		int number = Scanner.nextInt();
//	      boolean isprime = true;
//	      // prime check logic
//	      if(number <= 1) {
//	    	  isprime=false;      // number is less then or equal to 1 so is not prime number 
//	      }
//	      else {
//	    	  for(int i=2;i<number;i++) {
//	    		  if(number % i == 0) {
//	    			  isprime=false;
//	    			  break;
//	    		  }
//	    	  }
//	      }
//	      if(isprime) {
//	    	  System.out.println(number + "number is prime " );
//	      }
//	      else {
//	    	  System.out.println(number + "number is not prime ");
//	      }
//	      Scanner.close();
//	}
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.println("enter a number ");
		int number = Scanner.nextInt();
		int x = 0, count = 0;                  //x is used as a loop counter & count is used to count how many divisors the number has.
		for(x = 1; x <= number; x++) {
			if(number % x == 0) {         //This if statement checks if the current value of x divides number with no remainder
				count++;                // If the number is divisible by x, then count is incremented by 1, meaning x is a divisor of the number
			}
		}
		if(count == 2) {  //A prime number is divisible only by 1 and itself, so if the cnt is exactly 2, it means the number is only divisible by 1 and itself, and therefore it is prime.
			System.out.println("number is prime");
		}
		else {
			System.out.println("number is not prime ");
		}
	}
	

}
