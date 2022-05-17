package fullyVector;

import java.util.Scanner;
import java.util.Vector;

public class User {

	static Vector<Integer> b;

	User() {
		b = new Vector<Integer>();

	}

	public static void Input() {

		Scanner scan = new Scanner(System.in);
		b.clear();

		System.out.println("Enter Number");

		String str = scan.next();

		
		
			if (str.length() >= 4) {
		

			for (int i = 0; i < 4; i++) {

				for (int j = 0; j < i; j++) {

					while (str.charAt(i) == str.charAt(j)) {
						System.out.println("Duplicate");

						str = scan.next();
						j = 0;
					}

				}
			}
		}
			else {
				System.out.println("Please at least 4 number --");
				return;
			}
		
		
		if (b.size() != 0) {
			b.clear();
		}

		for (int k = 0; k < 4; k++) {
			String n = Character.toString(str.charAt(k));
			

			try {
				b.addElement(Integer.parseInt(n));

			} catch (NumberFormatException e) {
				System.out.println("Please Input Number Format ");
				break;
			}

		}

		System.out.println(b);

	}

}
