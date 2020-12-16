package com.udacity.jwdnd.course1.cloudstorage.mapper;

import com.udacity.jwdnd.course1.cloudstorage.model.File;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface FileMapper {
  @Select("SELECT * FROM FILES")
  List<File> findAll();

  @Select("SELECT * FROM FILES WHERE fileId = #{fileId}")
  File findOne(int fileId);

  @Select("SELECT * FROM FILES WHERE userid = #{userid}")
  List<File> findByUserId(int userid);

  @Insert("INSERT INTO FILES (filename, contenttype, filesize, filedata, userid) VALUES (#{file.filename}, #{file.contenttype}, #{file.filesize}, #{file.filedata}, #{userid})")
  int insertFile(File file, int userid);

  @Delete("DELETE FROM FILES WHERE fileId = #{fileId}")
  int deleteFile(int fileId);
}
