package week1.day2;

public class Palindrome {
	public static void main(String[] args) {
		int input = 12321; 
        int output = 0;
        int temp = input;
        
        while (temp != 0) {    //input is not equal to zero
            int digit = temp % 10; // 12321 modulus of 10
            output = output * 10 + digit; //0x10 + 12321
            temp /= 10;
        }

      
        if (input == output) {
            System.out.println("Input: " + input + " Output: It is a Palindrome");
        } else {
            System.out.println("Input: " + input + " Output: It is not a Palindrome");
        }
	}

}
