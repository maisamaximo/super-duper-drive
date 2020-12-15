package com.udacity.jwdnd.course1.cloudstorage.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Files {
  private Integer fileId;
  private String notetitle;
  private String contenttype;
  private String filesize;
  private User userid;
  // descobrir que tipo é esse filedata BLOB,
  private String filedata;

  public Files(Integer fileId, String notetitle, String contenttype, String filesize,
      User userid, String filedata) {
    this.fileId = fileId;
    this.notetitle = notetitle;
    this.contenttype = contenttype;
    this.filesize = filesize;
    this.userid = userid;
    this.filedata = filedata;
  }
}
