package com.example.demo.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class UserSearchRequest implements Serializable{
	 /**
	   * �W�������ƋC��
	   * �������ꂽ���N�G�X�g�f�[�^
	   */
	  private String genre;
	  private String feeling;
}
