import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MyMouseListener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		PointList.addStartPoint(new MyPoint(arg0.getX(), arg0.getY()));
		//PointList.add(new MyPoint(arg0.getX(), arg0.getY()));

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
