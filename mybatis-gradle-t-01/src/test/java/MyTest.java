import cn.getcharzp.helper.MybatisHelper;
import cn.getcharzp.mapper.UserMapper;
import cn.getcharzp.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void getUsers() {
        SqlSession sqlSession = MybatisHelper.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
