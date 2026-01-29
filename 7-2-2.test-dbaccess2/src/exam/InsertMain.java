package exam;

import java.lang.reflect.Member;

import dao.MemberDao;

/**
 * insert()メソッド、動作確認用の実行クラスです.
 * 
 * @author igamasayuki
 *
 */
public class InsertMain {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		Member menber = new Member(null,'シロー',54,3) {
		int affected = MemberDao.insert();

		System.out.println(affected+"件登録されました！");
		};
		System.out.println("insert終了");
	}

}
