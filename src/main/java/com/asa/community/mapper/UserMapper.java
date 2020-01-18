package com.asa.community.mapper;

import com.asa.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * 2020/1/18
 */
@Mapper
public interface UserMapper {

    @Insert("insert into user (name,account_id,token,gmt_modified) values (#{name},#{accountId},#{token},#{gmtModified},#{gmtModified})")
    void insert(User user);

}
