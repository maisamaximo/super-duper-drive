package com.udacity.jwdnd.course1.cloudstorage.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Users {
  private Integer userid;
  private String username;
  private String salt;
  private String password;
  private String firstName;
  private String lastName;

  public Users(Integer userid, String username, String salt, String password,
      String firstName, String lastName) {
    this.userid = userid;
    this.username = username;
    this.salt = salt;
    this.password = password;
    this.firstName = firstName;
    this.lastName = lastName;
  }
}
