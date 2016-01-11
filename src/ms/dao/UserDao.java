package ms.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import ms.dao.base.MySessionFactory;
import ms.model.User;

public class UserDao {
	
    public void add(User user) throws Exception{
		SqlSession session = MySessionFactory.getSqlSessionFactory().openSession();
		try {
			
			String statement = "UserMapper.saveUser";
			session.insert(statement, user);
			session.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("error in add method");
		} finally {
			session.close();
		}
         
    }
    
    public List<User> queryAllUser() throws Exception{
    	SqlSession session = MySessionFactory.getSqlSessionFactory().openSession();
    	List<User> users = new ArrayList<User>();
    	try{
            String statement = "UserMapper.queryAllUser";
            users = session.selectList(statement,1);
            session.commit();
            
    	} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("error in queryAllUser method");
		} finally {
			session.close();
		}
       
        return users;
    }
}
