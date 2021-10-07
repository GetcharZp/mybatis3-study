package cn.getcharzp.mapper;

import cn.getcharzp.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUsers();

    User getUserById(int id);
}
