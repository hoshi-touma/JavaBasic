/*
 * Student.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice12.common;

/**
 * 受講生の情報を格納します
 * @author Rhizome
 *
 */
public class Student {
	/** 受講生ID */
	private int studentId;

	/** 受講生氏名 */
	private String studentName;	

	/** 会社名 */
	private String companyName;
	
    /** 教室名 */
	private String className;

	/** メールアドレス */
	private String mail;

/** パスワード */
	private String password;

		
	// 受講生IDのアクセサ
		public int getStudentId() {
			return studentId;
		}
		public void setStudentid(int num) {
			this.studentId=num;
	    }
		
	// 氏名のアクセサ
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String name) {
			this.studentName=name;
		}

		
	// 会社名のアクセサ
		public String getCompanyName() {
			return companyName;
		}
		public void setCompanyName(String ca_name) {
			this.companyName=ca_name;
		}
		
		
	// 教室名のアクセサ
		public String getClassName() {
			return className;
		}
		public void setClassName(String cl_name) {
			this.className=cl_name;
		}
		
	
	//メールアドレスのアクセサ
		public String getMail() {
			return mail;
		}
		public void setMail(String mail) {
			this.mail=mail;
		}
		
		
	// パスワードのアクセサ
		public String getPassword() {
			return password;
		}
		public void setPassword(String pass) {
			this.password=pass;
		}
}
