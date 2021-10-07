package cn.getcharzp.mapper;

import cn.getcharzp.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> selectAll();

    List<User> selectByName(String name);

    int insert(User user);

    int update(User user);

    int delete(int id);
}
