import java.util.ArrayList;

public class MusicController {
	private ArrayList<MusicVO> list = new ArrayList<MusicVO>();
	private int cnt;

	public void add(MusicVO vo) {
		list.add(new MusicVO(vo.getTitle(), vo.getSinger(), vo.getPlayTime()));
		System.out.println("��ϵǾ����ϴ�.");
		// ���
	}

	public void getList() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + ". ����: " + list.get(i).getTitle() + "  ����: " + list.get(i).getSinger() + "  �ð�: "
					+ list.get(i).getPlayTime() + "��");
		}
		// ���
	}

	public MusicVO play() {
		// cnt++;
		System.out.println("���� : " + list.get(cnt).getTitle() + "  ���� : " + list.get(cnt).getSinger() + "  �ð� : "
				+ list.get(cnt).getPlayTime() + "��");
		// ����
		return null;
	}

	public MusicVO pre() {
		if (cnt == 0) {
			System.out.println("���� : " + list.get(cnt).getTitle() + "  ���� : " + list.get(cnt).getSinger() + "  �ð� : "
					+ list.get(cnt).getPlayTime() + "��");
		} else {
			cnt--;
			System.out.println("���� : " + list.get(cnt).getTitle() + "  ���� : " + list.get(cnt).getSinger() + "  �ð� : "
					+ list.get(cnt).getPlayTime() + "��");
		}

		// ������
		return null;
	}

	public MusicVO next() {
		if (cnt == list.size() - 1) {
			System.out.println("���� : " + list.get(cnt).getTitle() + "  ���� : " + list.get(cnt).getSinger() + "  �ð� : "
					+ list.get(cnt).getPlayTime() + "��");
		} else {
		cnt++;
		System.out.println("���� : " + list.get(cnt).getTitle() + "  ���� : " + list.get(cnt).getSinger() + "  �ð� : "
				+ list.get(cnt).getPlayTime() + "��");
		}
		// ������
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
