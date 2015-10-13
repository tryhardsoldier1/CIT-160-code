import java.util.Scanner;
/* The Caesar cipher is one of the earliest known and simplest ciphers. 
 * It is a type of substitution cipher in which each letter in the plaintext is 'shifted' a 
 * certain number of places down the alphabet.
 */
public class Caeser {

	public static void main(String[] args) {
		
		// Declaring data needed at top... this is good housekeeping!
		char message, encryptedMessage = ' ';
		int shift; //how many numbers to shift by 
		
		// Get info needed from the user
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter lowercase character to encrypt: ");
		message = keyboard.next().toLowerCase().charAt(0); // there is no getChar() method... so we improvise!
		System.out.println("You entered '" + message + "' which is " + (int)message + " in ASCII");
		
		System.out.print("Enter shift number: ");
		shift = keyboard.nextInt();
		
		// what goes here???
		
		
		System.out.println("Your encrypted message is: " + encryptedMessage);
		keyboard.close();
	}

}
