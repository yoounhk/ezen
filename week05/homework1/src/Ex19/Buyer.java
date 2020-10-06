package src.Ex19;

public class Buyer {
    int money = 1000;
    Product[] cart = new Product[3]; // ������ ��ǰ�� �����ϱ� ���� �迭
    int i = 0; // Product�迭 cart�� ���� index

    void buy(Product p) {
		/*
			(1) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�.
			1.1 ���� ���� ������ ������ ���ؼ� ���� ���� ������ �޼��带 �����Ѵ�.
			1.2 ���� ���� ����ϸ�, ��ǰ�� ������ ���� ������ ����
			1.3 ��ٱ��Ͽ� ������ ������ ��´�.(add�޼��� ȣ��)
		*/
        if(money < p.price) {
            System.out.println("�ܾ��� �����Ͽ� " + p.toString() + "��/�� �� �� �����ϴ�.");
            return;
        }
        else if (money > p.price) {
            money -= p.price;
            add(p);
        }
    }

    void add(Product p) {
		/*
		(2) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�.
			1.1 i�� ���� ��ٱ����� ũ�⺸�� ���ų� ũ��
			1.1.1 ������ ��ٱ��Ϻ��� 2�� ū ���ο� �迭�� �����Ѵ�.
			1.1.2 ������ ��ٱ����� ������ ���ο� �迭�� �����Ѵ�.
			1.1.3 ���ο� ��ٱ��Ͽ� ������ ��ٱ��ϸ� �ٲ۴�.
			1.2 ������ ��ٱ���(cart)�� �����Ѵ�. �׸��� i�� ���� 1 ������Ų��.
		*/
        if (i >= cart.length) {
            Product[] tmp = cart;
            cart = new Product[cart.length*2];
            for (int j = 0; j < tmp.length; j++) {
                cart[j] = tmp[j];
            }
        }
        cart[i] = p;
        i++;
    }

    void summary() {
		/*
			(3) �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ�.
			1.1 ��ٱ��Ͽ� ��� ���ǵ��� ����� ����� ����Ѵ�.
			1.2 ��ٱ��Ͽ� ��� ���ǵ��� ������ ��� ���ؼ� ����Ѵ�.
			1.3 ������ ��� ���� �ݾ�(money)�� ����Ѵ�.
		*/
        System.out.println("���ǵ�");
        int sum = 0;
        for (int j = 0; j < cart.length; j++) {
            System.out.println("cart[j] = " + cart[j]);
            sum += cart[j].price;
        }
        System.out.println("�� ����: " +sum);
        System.out.println(money);
    }
}
