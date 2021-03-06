package src.Ex01;

public class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
		/*
			(1) 배열 SutdaCard를 적절히 초기화 하시오.
		*/
        for (int i = 0; i < CARD_NUM; i++) {
            int n = (i + 2) / 2;
            boolean kwang = false;
            if (i == 0 || i == 4 || i == 14) kwang = true;
            cards[i] = new SutdaCard(n, kwang);
        }
    }
}
