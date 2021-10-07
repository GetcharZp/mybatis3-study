package cn.getcharzp;

import cn.getcharzp.mapper.UserMapper;
import cn.getcharzp.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        String resource = "cn/getcharzp/conf/mybatis-config.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            // 查询所以的用户
            List<User> users = mapper.getUsers();
            for (User user : users) {
                System.out.println(user);
            }
            // 根据用户ID进行查询
            User user = mapper.getUserById(1);
            System.out.println(user);
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
