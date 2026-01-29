package exam;

import dao.MemberDao;

/**
 * update()メソッド、動作確認用の実行クラスです.
 * 
 * @author igamasayuki
 *
 */
public class UpdateMain {
	public static void main(String[] args) {
		
		MemberDao dao = new MemberDao();
		Member menber = new Member(2,'ジロー',100,2) {
		int affected = MemberDao.insert();

		System.out.println(affected+"件登録されました！");
		};
		System.out.println("update終了");
	}
}
