package com.udacity.jwdnd.course1.cloudstorage.mapper;

import com.udacity.jwdnd.course1.cloudstorage.model.Note;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface NotesMapper {
  @Select("SELECT * FROM NOTES")
  List<Note> findAll();

  @Select("SELECT * FROM NOTES WHERE noteid = #{noteid}")
  Note findOne(int noteid);

  @Select("SELECT * FROM NOTES WHERE userid = #{userid}")
  List<Note> findByUserId(int userid);

  @Insert("INSERT INTO NOTES (notetitle, notedescription, userid) VALUES (#{note.notetitle}, #{note.notedescription}, #{userid})")
  int insertNote(Note note, int userid);

  @Delete("DELETE FROM NOTES WHERE noteid = #{noteid}")
  int deleteNote(int noteid);

  @Update("UPDATE NOTES SET notetitle = #{notetitle}, notedescription = #{notedescription} WHERE noteid = #{noteid}")
  int updateNote(Note note);
}
