package my.project.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class NoticeDAO {
	@Inject
	private SqlSession sql;
	
	private static String namespace = "my.project.mapper.noticeMapper";
	
	public List<NoticeVO> listAll() throws Exception{
	 return sql.selectList(namespace+".listAll");	
	}
}
