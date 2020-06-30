import java.util.Scanner;

public class MusicPlay {

	public static void main(String[] args) {  // �ֿ���

		Scanner sc = new Scanner(System.in);
		MusicController controller = new MusicController();

		System.out.println("====�����÷��̾�====");
		while (true) {
			System.out.print("1.��� 2.��� 3.���� 4.������ 5.������ 6.���� >> ");
			int choice = sc.nextInt();

			if (choice == 1) {  // �ڹ���
				System.out.println("====���====");
				System.out.print("���� : ");
				String title = sc.next();
				System.out.print("���� : ");
				String singer = sc.next();
				System.out.print("�ð� : ");
				int time = sc.nextInt();

				MusicVO vo = new MusicVO(title, singer, time);
				controller.add(vo);

			} else if (choice == 2) {  // �ֵ��� , �輳��
				System.out.println("====�뷡���====");
				controller.getList();

			} else if (choice == 3) {  // ����
				System.out.println("====����====");
				controller.play();
				
			} else if (choice == 4) {  // ����
				System.out.println("====������====");
				 controller.pre();
				 
			} else if (choice == 5) {  // ����
				System.out.println("====������====");
				 controller.next();
				
			} else if (choice == 6) {
				System.out.println("���α׷��� �����մϴ�.");
				System.out.println(controller.toSting());
				break;
			} else {
				System.out.println("��Ȯ�� ���ڸ� �Է����ּ���");
			}

		}
	}

}
