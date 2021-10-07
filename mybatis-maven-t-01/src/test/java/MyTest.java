import cn.getcharzp.helper.MybatisHelper;
import cn.getcharzp.mapper.UserMapper;
import cn.getcharzp.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void selectAll() {
        SqlSession sqlSession = MybatisHelper.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void selectByName() {
        SqlSession sqlSession = MybatisHelper.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectByName("%22%");
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void insert() {
        SqlSession sqlSession = MybatisHelper.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int insert = mapper.insert(new User(1, "name2", "password2"));
        System.out.println(insert);
    }

    @Test
    public void update() {
        SqlSession sqlSession = MybatisHelper.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int update = mapper.update(new User(7, "name222", "password222"));
        System.out.println(update);
    }

    @Test
    public void delete() {
        SqlSession sqlSession = MybatisHelper.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int delete = mapper.delete(7);
        System.out.println(delete);
    }
}
