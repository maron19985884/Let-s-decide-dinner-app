package com.example.demo.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class UserSearchRequest implements Serializable{
	 /**
	   * ジャンルと気分
	   * 検索されたリクエストデータ
	   */
	  private String genre;
	  private String feeling;
}
