package fullyVector;

import java.io.IOException;

public class predict_Number {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		Computer com=new Computer();
		com.generateNum();
		
		User user=new User();
		user.Input();
		
		Check k=new Check();
		boolean G=k.play(com.v, user.b);
		
		int count=1;
		while(!G) {
			System.out.println("Try again  ");
			user.Input();
			G=k.play(com.v, user.b);
			count++;
			
			if(count==3 && !G) {
				System.out.println("Game Over");
				
				System.out.println("Do you want to play again y --n");
				char newGame=(char)System.in.read();
				
				if(newGame=='y' || newGame=='Y') {
					count=1;
					Computer.v.removeAllElements();
					com.generateNum();
					user.Input();
					G=k.play(com.v,user.b);
				}
				else {
					System.out.println("See u again");
					return;
				}
			}
			
		}
		
		if(G) {
			System.out.println("Winner");
		}

	}

}
