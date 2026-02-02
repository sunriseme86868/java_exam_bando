package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.DBManager;
import dto.Member;

/**
 * membersテーブルを操作するDao.
 * 
 * @author igamasayuki
 *
 */
public class MemberDao {
	private final static String TABLE_NAME = "Member";
	/**
	 * 全件検索を行います.
	 * 
	 * @return メンバー情報の全件
	 */
	public List<Member> findAll(){
		Connection con = DBManager.createConnection();
		String sql = "SELECT name,age,dep_id FROM "+TABLE_NAME +" order by age decs"; 
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			// ここに全件検索処理を書く
			ArrayList<Member>list = new ArrayList<>();

			while(rs.next()){
				Member member = new Member();
				
				member.getString(rs.setName());
				member.getInt(rs.seId());
				member.getString(rs.setDep_id());
				list.add(member);
	
			}
			return list; //←コンパイルエラーを消すための処理なので必要なら書き換えてください
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("全件検索処理に失敗しました",e);
		} finally {
			DBManager.closeConnection(con);
		}
	}

	/**
	 * 主キー検索を行います.
	 * 
	 * @param id 検索したい主キーの値
	 * @return　メンバー情報(検索されなかった場合はnullが返ります)
	 */
	public Member load(int id){
		Connection con = DBManager.createConnection();
		String sql = "select name,age,dep_id from "+TABLE_NAME+ " where id =?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			// ここに主キー検索処理を書く
			pstmt.setInt(1, id);
			
			//try(ResultSet rs = pstmt.executeQuery()){
			//	if(rs.next()){
			//		Member member = new Member();
			//		member.setName(rs.getString());
			//		member.getAge(rs.setInt());
			//	}

			//}
			return null; //←コンパイルエラーを消すための処理なので必要なら書き換えてください
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("主キー検索処理に失敗しました",e);
		} finally {
			DBManager.closeConnection(con);
		}
	}
	/**
	 * メンバー情報を登録します.
	 * 
	 * @param member メンバー情報
	 * @return 
	 */
	public int insert(Member member){
		Connection con = DBManager.createConnection();
		String sql = "INSERT INTO "+TABLE_NAME+" (name,age,dep_id) VALUES(?,?,?)";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, member.getName());
			pstmt.setInt(2,member.getAge());
			pstmt.setInt(3,member.getDep_id());
			int affected = pstmt.executeUpdate();
			// ここに挿入処理を書く
			return affected;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("登録処理に失敗しました",e);
		} finally {
			DBManager.closeConnection(con);
		}
	}

	public static int update(Member member){
		Connection con = DBManager.createConnection();
		String sql = "UPDATE "+TABLE_NAME+" SET name=?,age=?,dep_id=? WHERE id =?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, member.getName());
			pstmt.setInt(2,member.getAge());
			pstmt.setInt(3,member.getDep_id());
			int affected = pstmt.executeUpdate();
			// ここに挿入処理を書く
			return affected;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("登録処理に失敗しました",e);
		} finally {
			DBManager.closeConnection(con);
		}
	}

}
