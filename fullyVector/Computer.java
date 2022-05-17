package fullyVector;

import java.util.Random;
import java.util.Vector;

public class Computer {

	static Vector<Integer> v;
	
	Computer(){
		v=new Vector<Integer>();
	}
	
	public void generateNum() {
		Random rand=new Random();
		
		while(v.size()<4 ) {
			
			int x=rand.nextInt(1,9);
			
			if(!v.contains(x))
				v.addElement(x);
			
			
		}
		
		System.out.println(v);
		
	}
	
	
}
