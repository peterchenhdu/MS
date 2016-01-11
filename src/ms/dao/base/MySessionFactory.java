package ms.dao.base;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

public class MySessionFactory {

	private static SqlSessionFactory sessionFactory;
	private MySessionFactory(){
		
	}
	
	public static synchronized SqlSessionFactory getSqlSessionFactory(){
		if(sessionFactory == null){
			try {
				return new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
			} catch (IOException e) {
				Logger.getLogger(MySessionFactory.class).error("getSqlSessionFactory error.");
				e.printStackTrace();
				return null;
			}
		}else{
			return sessionFactory;
		}
	}
	
}
