import java.util.Scanner;
public class ArabicToMaya {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an Arabic number");
		int input = sc.nextInt();
		int remainder = 0;
		String temp;
		String output = "";
		int base20num = 0;
		while(input != 0) {
			temp = "";
			remainder = input % 20;
			//base20num = remainder * Math.pow(20, p);
			if (remainder !=0)
			{
				while(remainder != 0) {
					if(remainder > 0) {
						if(remainder >= 5) {
							temp += "|";
							remainder -= 5;
						} else if(remainder < 5) {
							temp += "O";
							remainder -= 1;
						}
					}

				}
			} else {
				temp += "x";
			}
						
			input = input / 20;
			
			//p++;
			output = "\n" + temp + output;
			
		}
			System.out.println(output);
			





	}


}