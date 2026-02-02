package exam;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

import dao.MemberDao;

/**
 * findAll()メソッド、動作確認用の実行クラスです.
 * 
 * @author igamasayuki
 *
 */
public class FindAllMain {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		List<dto.Member>list = dao.findAll();

		for(dto.Member member : list){
			System.out.println("name= "+member.getName());
			System.out.println("age= "+member.getAge());
			System.out.println("dep_id= "+member.getDep_id());


		}

	

	}

}
