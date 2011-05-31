package petshopdemo;

public class PetShop {
	private Pet[] pets; // ��ʾ�ж������
	private int foot; // ����ű�

	public PetShop(int len) {// ����ĸ�������ͨ���ⲿָ��
		if (len > 0) {// �ж�����ĸ��������Ƿ����0
			this.pets = new Pet[len];
		} else {
			this.pets = new Pet[1];// ���ٱ���һ������
		}
	}

	public boolean add(Pet pet) {// ���ӳ�������Ƿ����ӳɹ�����Ϣ
		if (this.foot < this.pets.length) {// �������ӳ���
			this.pets[this.foot] = pet; // �������
			this.foot++;// �޸Ľű�
			return true; // ���ӳɹ�
		} else {
			return false;// ����ʧ��
		}
	}

	// ��Ϊ��ѯ��ʱ����ܷ��ض�����ݣ����Ի�Ӧ�����������ʽ��ʾ
	public Pet[] search(String keyWord) {// ���ݹؼ��ֲ�ѯ
		Pet[] result = null; // �������飬���ǣ���С��ָ��
		int count = 0; // ��¼���ж����ֳ��������Ϣ
		for (int i = 0; i < this.pets.length; i++) {// ѭ����ѯ
			if (this.pets[i] != null) {// ��ʾ�г�����Ϣ
				if (this.pets[i].getName().indexOf(keyWord) != -1) {// ��ѯ�����
					count++; // �޸Ĳ�ѯ����
				}
			}
		}
		result = new Pet[count]; // ���ݲ��ҵĸ�����������ռ�
		count = 0; // ��������
		for (int i = 0; i < this.pets.length; i++) {// ѭ����ѯ
			if (this.pets[i] != null) {// ��ʾ�г�����Ϣ
				if (this.pets[i].getName().indexOf(keyWord) != -1) {// ��ѯ�����
					result[count] = this.pets[i];// ���ز�ѯ������
					count++; // �޸Ĳ�ѯ����
				}
			}
		}
		return result;
	}
}
