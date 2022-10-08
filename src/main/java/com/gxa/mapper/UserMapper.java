package com.gxa.mapper;

import com.gxa.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User queryUserNameAndPwd(@Param("userName") String userName, @Param("pwd") String pwd);
}
