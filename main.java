// you might need to declare your package here <

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String name;
		String index;
		
		System.out.println("Enter String: ");
		name = scanner.nextLine();
		
		System.out.println(name);
		System.out.println("Check for index of: ");
		index = scanner.nextLine();
		
		int indexPlus = name.indexOf(index) + 1;
		
		if(name.indexOf(index) == -1) {
			System.out.println("The character " + index + " is not in the string!");
		}
		else if(index.isBlank() == true) {
			System.out.println("You did not enter a character!");
		}
		else {
			System.out.println("The character " + index + " first appears in index " + name.indexOf(index) + " Or Letter " + (name.indexOf(index) + 1) + "/" + name.length());
		}
		
		scanner.close();
	}
		
}
