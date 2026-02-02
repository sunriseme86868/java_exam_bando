package exam;

import dao.MemberDao;
import dto.Member;

public class Answerup {
/**
 * update()メソッド、動作確認用の実行クラスです.
 * 
 * @author igamasayuki
 *
 */

	public static void main(String[] args) {
		
		MemberDao dao = new MemberDao();
		Member member = dao.load(2);
		member.setAge(100); // 100歳に変更(結果はpgAdminで確認する)
		dao.update(member);
		System.out.println("update終了");
	}
}
