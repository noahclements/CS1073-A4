/**
	Represents a class used for converting Arabic numbers to Maya
	@author Noah Clements 3585596
*/
import java.util.Scanner;
public class ArabicToMaya {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int remainder = 0;
		String temp;		// initializing variables
		String output = "";	// setting it to null

		System.out.println("Enter an Arabic number");
		int input = sc.nextInt();

		while(input != 0) {
			temp = "";	// temp variable will be reset to null after every loop
			remainder = input % 20;	
			if (remainder !=0) { // will only do the stuff below if remainder is 0
				while(remainder != 0) {	// the loop to figure out the output of that one line
					if(remainder > 0) {
						if(remainder >= 5) {
							temp += "|"; // adds "5" to the line in maya
							remainder -= 5;	// removes 5 from remainder and continues
						} else if(remainder < 5) {
							temp += "O";	// adds "1" to the line in maya
							remainder -= 1;	// removes 1 from remainder and continues
						}
					}
							// will go through loop until remainder is zero
				}
			} else { // if the remainder is zero
				temp += "x";	// adds "0" to the line in maya
			}
						
			input = input / 20;	// divides the input by the base
			
			//p++;
			output = "\n" + temp + output;	// adds new line, then adds output to temp
			// new line is there to seperate the rows
		}
			System.out.println(output);	// prints out the converted number

	}


}