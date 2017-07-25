package cw20170724.ap;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class DemoInterfaces {
	public static void main(String[]args){
		
		JFrame frame = new JFrame("Demo");
		
		JPanel panel = new JPanel();
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//1)
		//panel.addMouseListener(new MyMouseListener());
		
		//2)
		// через анонимный класс
		//panel.addMouseListener(new MouseAdapter(){});
		
		//3)
		//panel.addMouseListener(new MyAdapter());
		
		//4)
		// громадна€ реализаци€
		panel.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e);		
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println(e);	
			}

			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println(e);	
			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println(e);	
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println(e);	
			}	
		});
		
		panel.setPreferredSize(new Dimension(400, 400));
		frame.add(panel);
		frame.pack();
		
		//frame.setSize(400, 400);
		frame.setVisible(true);
		
	}
}
