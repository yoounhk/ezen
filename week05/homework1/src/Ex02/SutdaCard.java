package src.Ex02;

public class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    // info()��� ObjectŬ������ toString()�� �������̵��ߴ�.
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}