package com.ff;

import com.ff.dao.UserDao;
import com.ff.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

/**
 * spring容器
 *
 * @author
 */
public class SpringApplication {

    public static void main(String[] args) {
        // 加载配置文件
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = sessionFactory.openSession();
            UserDao mapper = sqlSession.getMapper(UserDao.class);
            // mapper.方法 调用

            sqlSession.commit();
            sqlSession.close();
            resourceAsStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
