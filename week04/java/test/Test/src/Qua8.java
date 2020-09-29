

public class Qua8 {
    public static void main(String args[]) {
        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++)
            System.out.print(deck.cards[i] + ",");

        System.out.println();
        System.out.println(deck.pick(0));

    }

}

class SutdaCard {
	int num;
	boolean isKwang;

	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

	public SutdaDeck() {
		for (int i = 1; i <= CARD_NUM; i++) {
			int sutdaNum = (i+1)/2;
			boolean nowKwang = false;
			if ((i == 1 || i == 5 || i == 16)) { // 1,5,16은 각각 처음 나오는 1,3,8의 인덱스
				nowKwang = true;
			}
			cards[i-1] = new SutdaCard(sutdaNum, nowKwang);
		}
	}

	public void shuffle() {
		SutdaCard tmp;
		for (int i = 0; i < CARD_NUM; i++) {
			int rnd = (int)(Math.random()*CARD_NUM);
			tmp = cards[i];
			cards[i] = cards[rnd];
			cards[rnd] = tmp;
		}
	}

	public SutdaCard pick(int index) {
		return cards[index];
	}


	public SutdaCard pick() {
		return cards[(int)(Math.random()*CARD_NUM)];
	}
}