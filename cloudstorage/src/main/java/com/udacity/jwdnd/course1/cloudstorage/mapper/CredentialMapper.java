package com.udacity.jwdnd.course1.cloudstorage.mapper;

import com.udacity.jwdnd.course1.cloudstorage.model.Credential;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface CredentialMapper {
  @Select("SELECT * FROM CREDENTIALS")
  List<Credential> findAll();

  @Select("SELECT * FROM CREDENTIALS WHERE credentialid = #{credentialid}")
  Credential findOne(int credentialid);

  @Select("SELECT * FROM CREDENTIALS WHERE userid = #{userid}")
  List<Credential> findByUserId(int userid);

  @Insert("INSERT INTO CREDENTIALS (url, username, key, password, userid) VALUES (#{credential.url}, #{credential.username}, #{credential.key}, #{credential.password}, #{userid})")
  int insertCredential(Credential credential, int userid);

  @Delete("DELETE FROM CREDENTIALS WHERE credentialid = #{credentialid}")
  int deleteCredential(int credentialid);

  @Update("UPDATE CREDENTIALS SET url = #{url}, username = #{username}, key = #{key}, password = #{password} WHERE credentialid = #{credentialid}")
  int updateCredential(Credential credential);
}
