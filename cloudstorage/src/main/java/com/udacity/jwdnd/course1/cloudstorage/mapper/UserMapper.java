package com.udacity.jwdnd.course1.cloudstorage.mapper;

import com.udacity.jwdnd.course1.cloudstorage.model.User;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {

  @Select("SELECT * FROM USERS")
  List<User> findAll();

  @Select("SELECT * FROM USERS WHERE userid = #{userid}")
  User findOne(int userid);

  @Select("SELECT * FROM USERS WHERE username = #{username}")
  User findByUsername(String username);

  @Insert("INSERT INTO USERS (username, salt, password, firstName, lastName) VALUES(#{username}, #{salt}, #{password}, #{firstName}, #{lastName})")
  @Options(useGeneratedKeys = true, keyProperty = "userid")
  int insert(User user);

  @Delete("DELETE FROM USERS WHERE username = #{username}")
  int deleteUser(String username);

  @Update("UPDATE USERS SET username = #{username}, password = #{password}, salt = #{salt}, firstname = #{firstname}, lastname = #{lastname} WHERE userid = #{userid}")
  int updateUser(User user);
}