package week02.homework03;

public class Hw02 {
    public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard();

        System.out.println(card1.info());
        System.out.println(card2.info());
    }

    static class SutdaCard {
        private int num = 1;
        private boolean isKwang = true;

        public SutdaCard() { }
        public SutdaCard(int num, boolean isKwang) {
            this.num = num;
            this.isKwang = isKwang;
        }


        public String info() {
            return this.num + (this.isKwang ?"K":"");
        }
    }
}
