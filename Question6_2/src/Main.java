import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StoreController controller = new StoreController();
		while (true) {
			System.out.print("[1]음식점보기 [2]미용실보기 [3]상세보기 [4]평점보기 [5]종료 >> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("====음식점보기====");
				controller.getList("음식점");
			} else if (choice == 2) {
				System.out.println("====미용실보기====");
				controller.getList("미용실");
			} else if (choice == 3) {
				System.out.println("====상세정보====");
				System.out.print("가게명 입력 : ");
				String name = sc.next();
				controller.getStore(name);

			} else if (choice == 4) {
				System.out.println("====평점보기====");
				controller.starCount();

			} else if (choice == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;

			} else {
				System.out.println("정확한 숫자를 입력해주세요.");
			}
		}
	}
}
