package solitare.old;

import java.awt.Graphics;

class TablePile extends CardPile {
	
	int count;
	int heightPile;
	
	TablePile(int x, int y, int c) {
		// initialize the parent class
		super(x, y);
		// then initialize our pile of cards
		for (int i = 0; i < c; i++) {
			if (i==0){
				heightPile = 80+Card.height;
			}
			else{
				heightPile+=30;
			}
			push(Solitare.deckPile.pop());
			count++;
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
		return x <= tx && tx <= x + Card.width && y <= ty && ty<= heightPile;
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
		//FIXME missing cards
		CardPile curStack = new CardPile(x,y);
		int curHeight = 80;
		int curCount = 0;
		while (!this.isEmpty() && ty < heightPile - 30) {
			Card card = this.pop();
			curStack.push(card);
			heightPile-=30;
			count--;
			curCount++;
			if (curCount == 1){
				curHeight+= Card.height;
			}
			else{
				curHeight+=30;
			}
		}
		System.out.println(curCount + " :" + count);
		if (curStack.isEmpty()) {
			return;
		}
		topCard = curStack.pop();
		if (pileId >= 2 && pileId <= 5) {
			if (Solitare.suitPile[pileId - 2].canTake(topCard)) {
				Solitare.suitPile[pileId - 2].push(topCard);
				while (!curStack.isEmpty()) {
					topCard = curStack.pop();
					Solitare.suitPile[pileId - 2].push(topCard);
				}
				topCard = top();
				if (topCard != null && !topCard.isFaceUp()) {
					topCard.flip();
				}
				return;
			}
		} else if (pileId >= 6 && pileId <= 12) {
			if (Solitare.tableau[pileId - 6].canTake(topCard)) {
				Solitare.tableau[pileId - 6].push(topCard);
				while (!curStack.isEmpty()) {
					topCard = curStack.pop();
					Solitare.suitPile[pileId - 2].push(topCard);
					if (Solitare.tableau[pileId - 6].count == 0){
						Solitare.tableau[pileId - 6].count+= 80 + Card.height;
					}
					else{
						Solitare.tableau[pileId - 6].heightPile+=30;
					}
					Solitare.tableau[pileId - 6].count++;
				}
				//System.out.println(Solitare.tableau[pileId - 6].heightPile);
				topCard = top();
				if (topCard != null && !topCard.isFaceUp()) {
					topCard.flip();
				}
				return;
			}
		}
		push(topCard);
		int i =0;
		// else put it back on our pile
		while (!curStack.isEmpty()) {
			topCard = curStack.pop();
			this.push(topCard);
			if (i==0){
				heightPile = 80+Card.height;
			}
			else{
				heightPile+=30;
			}
			i++;
		}
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