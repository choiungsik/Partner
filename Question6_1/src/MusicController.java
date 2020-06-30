import java.util.ArrayList;

public class MusicController {
	private ArrayList<MusicVO> list = new ArrayList<MusicVO>();
	private int cnt;

	public void add(MusicVO vo) {
		list.add(new MusicVO(vo.getTitle(), vo.getSinger(), vo.getPlayTime()));
		System.out.println("등록되었습니다.");
		// 등록
	}

	public void getList() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + ". 제목: " + list.get(i).getTitle() + "  가수: " + list.get(i).getSinger() + "  시간: "
					+ list.get(i).getPlayTime() + "초");
		}
		// 목록
	}

	public MusicVO play() {
		// cnt++;
		System.out.println("제목 : " + list.get(cnt).getTitle() + "  가수 : " + list.get(cnt).getSinger() + "  시간 : "
				+ list.get(cnt).getPlayTime() + "초");
		// 실행
		return null;
	}

	public MusicVO pre() {
		if (cnt == 0) {
			System.out.println("제목 : " + list.get(cnt).getTitle() + "  가수 : " + list.get(cnt).getSinger() + "  시간 : "
					+ list.get(cnt).getPlayTime() + "초");
		} else {
			cnt--;
			System.out.println("제목 : " + list.get(cnt).getTitle() + "  가수 : " + list.get(cnt).getSinger() + "  시간 : "
					+ list.get(cnt).getPlayTime() + "초");
		}

		// 이전곡
		return null;
	}

	public MusicVO next() {
		if (cnt == list.size() - 1) {
			System.out.println("제목 : " + list.get(cnt).getTitle() + "  가수 : " + list.get(cnt).getSinger() + "  시간 : "
					+ list.get(cnt).getPlayTime() + "초");
		} else {
		cnt++;
		System.out.println("제목 : " + list.get(cnt).getTitle() + "  가수 : " + list.get(cnt).getSinger() + "  시간 : "
				+ list.get(cnt).getPlayTime() + "초");
		}
		// 다음곡
		return null;
	}

	public String toSting() {
		String result = "";
		for (int i = 0; i < list.size(); i++) {
			result += list.get(i).getTitle() + "\t" + list.get(i).getSinger() + "\t" + list.get(i).getPlayTime() + "\n";
		}

		return result;
	}

}
