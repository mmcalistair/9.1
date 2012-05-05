import javax.swing.JPanel;
import java.awt.*;
import java.util.*;


public class DrawPanel extends JPanel {
	
	
	
	private PointList pList = new PointList();
	
	private int t_x = 0;
	private int t_y = 0;
	
	
	
	@Override
	protected void paintComponent( Graphics g )
	{
	    super.paintComponent( g );
	    //g.drawLine( 10, 10, 100, 50 );
	    Iterator<MyPoint> t = pList.iterator();
	    MyPoint tmp;
	    int i = 0;
	    while(t.hasNext()){
	    	tmp = t.next();
	    	g.drawOval(tmp.x, tmp.y, 4, 4);
	    	//g.drawString(Integer.toString(i), tmp.x+5, tmp.y+5);
	    	i++;
	    }
	}
	
	
	
	
	
	
}