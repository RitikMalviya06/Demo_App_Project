package Number_Java_Program;

import java.util.Scanner;

public class Palindrome_Number {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = src.nextInt();
		 int oringalnum = num;
		int reverse = 0;
		while(num != 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}
		if(oringalnum == reverse) {
			System.out.println(" Its is a palindrome number");
		}
		else {
			System.out.println(" Its is not a palindrome number ");
		}
	}

}
