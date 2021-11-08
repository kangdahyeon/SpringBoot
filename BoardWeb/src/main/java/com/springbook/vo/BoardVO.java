package com.springbook.vo;

//xml로 변환하려면 기본 생성자가 필요한데
//java.sql.Date는 기본생성자가 없다.
import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class BoardVO {
	
	private int seq;
	private String title;
	private String writer;
	private String content;
	private Date regDate;
	private int cnt;
	private String SearchCondition;
	private String SearchKeyword;
	private MultipartFile uploadFile;

}
