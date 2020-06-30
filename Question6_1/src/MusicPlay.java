import java.util.Scanner;

public class MusicPlay {

	public static void main(String[] args) {  // 최웅식

		Scanner sc = new Scanner(System.in);
		MusicController controller = new MusicController();

		System.out.println("====뮤직플레이어====");
		while (true) {
			System.out.print("1.등록 2.목록 3.실행 4.이전곡 5.다음곡 6.종료 >> ");
			int choice = sc.nextInt();

			if (choice == 1) {  // 박민지
				System.out.println("====등록====");
				System.out.print("제목 : ");
				String title = sc.next();
				System.out.print("가수 : ");
				String singer = sc.next();
				System.out.print("시간 : ");
				int time = sc.nextInt();

				MusicVO vo = new MusicVO(title, singer, time);
				controller.add(vo);

			} else if (choice == 2) {  // 최도현 , 김설아
				System.out.println("====노래목록====");
				controller.getList();

			} else if (choice == 3) {  // 김평강
				System.out.println("====실행====");
				controller.play();
				
			} else if (choice == 4) {  // 김평강
				System.out.println("====이전곡====");
				 controller.pre();
				 
			} else if (choice == 5) {  // 김평강
				System.out.println("====다음곡====");
				 controller.next();
				
			} else if (choice == 6) {
				System.out.println("프로그램을 종료합니다.");
				System.out.println(controller.toSting());
				break;
			} else {
				System.out.println("정확한 숫자를 입력해주세요");
			}

		}
	}

}
