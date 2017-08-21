package solitare.old;

class DiscardPile extends CardPile {

	DiscardPile(int x, int y) {
		super(x, y);
	}

	@Override
	public void push(Card aCard) {
		if (!aCard.isFaceUp()) {
			aCard.flip();
		}
		super.push(aCard);
	}

	@Override
	public void select(int tx, int ty, int pileId) {
		if (isEmpty()) {
			return;
		}
		Card topCard = pop();
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
		// nobody can use it, put it back on our list
		push(topCard);
	}
}