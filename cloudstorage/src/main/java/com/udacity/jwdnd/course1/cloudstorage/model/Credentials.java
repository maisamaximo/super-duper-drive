package com.udacity.jwdnd.course1.cloudstorage.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Credentials {
  private Integer credentialid;
  private String url;
  private String username;
  private String key;
  private String password;
  private Users userid;

  public Credentials(Integer credentialid, String url, String username, String key,
      String password, Users userid) {
    this.credentialid = credentialid;
    this.url = url;
    this.username = username;
    this.key = key;
    this.password = password;
    this.userid = userid;
  }
}
