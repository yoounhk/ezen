package src.Ex14;

public class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < CARD_NUM; i++) {
            int n = (i + 2) / 2;
            boolean kwang = false;
            if (i == 0 || i == 4 || i == 14) kwang = true;
            cards[i] = new SutdaCard(n, kwang);
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
