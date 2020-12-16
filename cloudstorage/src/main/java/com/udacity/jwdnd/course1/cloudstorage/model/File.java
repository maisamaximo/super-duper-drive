package com.udacity.jwdnd.course1.cloudstorage.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@Data
//@Builder
@NoArgsConstructor
@AllArgsConstructor
public class File {
  private Integer fileId;
  private String notetitle;
  private String contenttype;
  private String filesize;
  private User userid;
  private byte[] filedata;
}
