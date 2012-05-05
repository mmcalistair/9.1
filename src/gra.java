import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.*;

public class gra {

	/**
	 * @param args
	 */
	
	public static Canvas can = new Canvas();
	
	
	
	
	public static void main(String[] args) {
		
		while(true){
			
			try {
				Thread.sleep(50);
				can.my_re();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
	}

}
