package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Exam1 {

    public static void main(String[] args) {
        	// 接続情報
		String url = "jdbc:postgresql://localhost:5432/student";
		String user = "asahi";
		String password = "postgres";

		Connection con = null; // 使用する変数の宣言
		PreparedStatement pstmt = null;

        	// (2)SQL文を作成
            StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO test_members (name,age,dep_id) values('山田太郎',62,1);") ;
            sql.append("INSERT INTO test_members (name,age,dep_id) values('佐藤花子',33,2);") ;
            sql.append("INSERT INTO test_members (name,age,dep_id) values('遠藤次郎',55,2);") ;
            

		try {
			// (1)データベースに接続
			con = DriverManager.getConnection(url, user, password);

			// (3)SQL実行準備
			pstmt = con.prepareStatement(sql.toString());

			// (4)SQL実行
			int numOfupdate = pstmt.executeUpdate();
            // (5)結果の操作
			// ※ここに結果の操作処理を書く
            System.out.println("処理が終わりました。");
		} catch (SQLException ex) {
			System.err.println("SQL = " + sql);
			ex.printStackTrace();
		} finally {
			try {
				// (6) メモリの解放(切断)
                if(con != null){
                    con.close();
                }
                if(pstmt != null){
                    pstmt.close();
                }
			} catch (Exception ex) {}
		}
	}
}
