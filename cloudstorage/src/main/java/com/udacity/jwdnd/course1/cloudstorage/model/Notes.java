package com.udacity.jwdnd.course1.cloudstorage.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Notes {
  private Integer noteid;
  private String notetitle;
  private String notedescription;
  private User userid;

  public Notes(Integer noteid, String notetitle, String notedescription,
      User userid) {
    this.noteid = noteid;
    this.notetitle = notetitle;
    this.notedescription = notedescription;
    this.userid = userid;
  }
}
