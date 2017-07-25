package cw20170724.ap;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * 
 * pattern - наблюдатель
 *
 */

public class MyMouseListener implements MouseListener{

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
	
}