package petshopdemo;

public class TestPetShop {
	public static void main(String[] args) {
		PetShop shop = new PetShop(5); // �����ܴ��5��������̵�
		shop.add(new Cat("��è", 3, 89.4f)); // ���ӳ���ɹ�
		shop.add(new Cat("��è", 2, 19.4f)); // ���ӳ���ɹ�
		shop.add(new Cat("��è", 3, 89.4f)); // ���ӳ���ɹ�
		shop.add(new Cat("�׹�", 3, 89.4f)); // ���ӳ���ɹ�
		shop.add(new Cat("�ڹ�", 3, 89.4f)); // ���ӳ���ɹ�
		shop.add(new Cat("��", 3, 89.4f)); // ���ӳ��ʧ��
		Pet p[] = shop.search("��");
		for (int x = 0; x < p.length; x++) {
			System.out.println(p[x]) ;
		}
	}

}
