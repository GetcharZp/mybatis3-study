package cn.getcharzp.mapper;

import cn.getcharzp.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> selectUser();

    List<User> selectByName(Map map);

    int insertUser(User user);

    int updateUser(User user);

    int deleteUser(int id);
}
