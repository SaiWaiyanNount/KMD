package fullyVector;

import java.util.Vector;

public class Check {

	Check() {

	}

	public boolean play(Vector<Integer> x, Vector<Integer> y) {
		// TODO Auto-generated method stub
		int h = 0;
		int b = 0;
	//	System.out.println(x + " " + y);
		for (int i = 0; i < x.size(); i++) {

			for (int j = 0; j < y.size(); j++) {

				if (i == j && x.get(i) == y.get(j)) {
					h++;
				} else if (x.get(i) == y.get(j)) {
					b++;
				}
			}

		}

		System.out.println(h + " H " + b + " B ");

		if (h == 4) {
			return true;
		} else {

			return false;
		}

	}
}
