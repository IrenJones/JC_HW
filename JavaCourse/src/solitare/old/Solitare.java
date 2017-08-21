package solitare.old;

import java.applet.Applet;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Image;

public class Solitare extends Applet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Image bgImage;
	boolean moveCards = false;
	int prevX = 0;
	int prevY = 0;
	int pileId = 0;

	static DeckPile deckPile;
	static DiscardPile discardPile;
	static TablePile tableau[];
	static SuitPile suitPile[];
	static CardPile allPiles[];

	@Override
	public void init() {
		bgImage = getImage(getCodeBase(), "/images/ima.jpg");
		setSize(450, 400);
		// first allocate the arrays
		allPiles = new CardPile[13];
		suitPile = new SuitPile[4];
		tableau = new TablePile[7];
		// then fill them in
		allPiles[0] = deckPile = new DeckPile(335, 5);
		allPiles[1] = discardPile = new DiscardPile(268, 5);
		for (int i = 0; i < 4; i++) {
			allPiles[2 + i] = suitPile[i] = new SuitPile(15 + 60 * i, 5);
		}
		for (int i = 0; i < 7; i++) {
			allPiles[6 + i] = tableau[i] = new TablePile(5 + 55 * i, 80, i + 1);
		}
		// System.out.println("Working dir: " + System.getProperty("user.dir"));
	}

	@Override
	public void paint(Graphics g) {
		bgImage = getImage(getCodeBase(), "ima.jpg");
		g.drawImage(bgImage, 0, 0, this);
		for (int i = 0; i < 13; i++) {
			allPiles[i].display(g);
		}
	}

	@Override
	public boolean mouseDown(Event evt, int x, int y) {
		for (int i = 0; i < 13; i++) {
			if (allPiles[i].includes(x, y) && i == 0) {
				moveCards = false;
				allPiles[i].select(x, y, 0);
				repaint();
				return true;
			} else if (allPiles[i].includes(x, y)){
					if (moveCards) {
						if (i > 1) {
							allPiles[pileId].select(prevX, prevY, i);
							repaint();
							moveCards = false;
							return true;
						}
					} else if (i == 1 || i >= 6 && i <= 12){
						prevX = x;
						prevY = y;
						pileId = i;
						moveCards = true;
						return true;
					}
			}
		}
		return true;
	}

}
