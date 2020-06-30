import java.util.ArrayList;

public class StoreController {
	private ArrayList<Store> list = new ArrayList<Store>();

	public StoreController() {
		Restaurant r1 = new Restaurant("�ؼ��Ĵ�", "������", 80, 70, 60, 90);
		Restaurant r2 = new Restaurant("�����̳�", "������", 100, 100, 71, 100);
		Restaurant r3 = new Restaurant("�ջ����", "������", 90, 90, 90, 34);
		Salon s1 = new Salon("�ڽ�ö", "�̿��", 100, 100, 67.99);
		Salon s2 = new Salon("�̰���", "�̿��", 100, 100, 70.99);
		Salon s3 = new Salon("����", "�̿��", 87, 87, 87);
		list.add(r1);
		list.add(r2);
		list.add(r3);
		list.add(s1);
		list.add(s2);
		list.add(s3);
	}

	public void getList(String name) {

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getEvent().equals(name)) {
				System.out.println((i + 1) + ". " + list.get(i).getName() + "\t" + "���� : " + list.get(i).grade());
			}
		}
		System.out.println();
		// ���� ����Ʈ�� �������� ���
	}

	public void getStore(String searchStore) {
		int add = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(searchStore)) {
				System.out.println("���Ը� : " + searchStore);
				add = i;
				break;
			}
		}
		for (int i = 10; i < 101; i += 10) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for (int i = 1; i < 11; i++) {
			if (i * 10 < list.get(add).grade()) {
				System.out.print("*\t");
			}
		}
		System.out.println();
		System.out.println("���� : " + list.get(add).grade());
		// ���������
	}

	public void starCount() {

		for (int j = 100; j > 0; j -= 10) {
			System.out.print(j + "\t");
			for (int i = 0; i < list.size(); i++) {
				if (j < list.get(i).grade()) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		System.out.print("\t");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getName()+"\t");
		}
		System.out.println();
		// TODO Auto-generated method stub

	}

}
