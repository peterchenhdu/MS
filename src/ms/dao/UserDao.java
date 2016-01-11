package ms.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import ms.dao.base.MySessionFactory;
import ms.model.User;

public class UserDao {
	

    
    public void add(User user){
    	 SqlSession session = MySessionFactory.getSqlSessionFactory().openSession();
    	   
         String statement = "UserMapper.saveUser";

         session.insert(statement, user);

         session.commit();
         
         session.close();
    }
    
    public List<User> queryAllUser(){
        
    	List<User> users = new ArrayList<User>();
       
    	SqlSession session = MySessionFactory.getSqlSessionFactory().openSession();
       
        String statement = "UserMapper.queryAllUser";
       
        users = session.selectList(statement);
       
        session.commit();

        return users;
    }
}
