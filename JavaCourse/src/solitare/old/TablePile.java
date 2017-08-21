package solitare.old;

import java.awt.Graphics;

class TablePile extends CardPile {

	TablePile(int x, int y, int c) {
		// initialize the parent class
		super(x, y);
		// then initialize our pile of cards
		for (int i = 0; i < c; i++) {
			push(Solitare.deckPile.pop());
		}
		// flip topmost card face up
		top().flip();
	}

	@Override
	public boolean canTake(Card aCard) {
		if (isEmpty()) {
			return aCard.getRank() == 12;
		}
		Card topCard = top();
		return (aCard.getColor() != topCard.getColor()) && (aCard.getRank() == topCard.getRank() - 1);
	}

	@Override
	public boolean includes(int tx, int ty) {
		// don't test bottom of card
		return x <= tx && tx <= x + Card.width && y <= ty;
	}

	@Override
	public void select(int tx, int ty, int pileId) {
		if (isEmpty()) {
			return;
		}

		// if face down, then flip
		Card topCard = top();
		if (!topCard.isFaceUp()) {
			topCard.flip();
			return;
		}

		topCard = pop();
		if (pileId >=2 && pileId <=5){
			if (Solitare.suitPile[pileId-2].canTake(topCard)) {
				Solitare.suitPile[pileId-2].push(topCard);
				return;
			}
		}
		else if (pileId >=6 && pileId <=12){
			if (Solitare.tableau[pileId-6].canTake(topCard)) {
				Solitare.tableau[pileId-6].push(topCard);
				return;
			}
		}
		// else put it back on our pile
		push(topCard);
	}

	private int stackDisplay(Graphics g, Card aCard) {
		int localy;
		if (aCard == null) {
			return y;
		}
		localy = stackDisplay(g, aCard.link);
		aCard.draw(g, x, localy);
		return localy + 30;
	}

	@Override
	public void display(Graphics g) {
		stackDisplay(g, top());
	}

}