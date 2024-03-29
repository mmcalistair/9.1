import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

import javax.swing.JFrame;


public class Canvas extends JFrame {
	

	
	private DrawPanel dp = new DrawPanel();
	private JButton buttonReset = new JButton("Reset");
	
	
	public Canvas(){
		setUndecorated(true);
		
		
		
		dp.setSize(1000, 950);
		getContentPane().setLayout(new BorderLayout());
		this.setBackground(Color.WHITE);
		//this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setSize(1000, 1000);
		this.setLocationRelativeTo(null);
		this.addMouseListener(new MyMouseListener());
		getContentPane().add(dp, BorderLayout.CENTER);
		getContentPane().add(buttonReset, BorderLayout.SOUTH);
		buttonReset.addActionListener(al);
		this.setVisible(true);
		
	}
	
	ActionListener al = new ActionListener() {
		  @Override public void actionPerformed( ActionEvent e ) {
		    PointList.clearPointList();
		    PointList.reset();
		  }
		};

	
	public void my_re(){
		dp.repaint();
	}
}
