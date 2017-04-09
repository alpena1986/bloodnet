package com.bloodnet.com.consts;


public class Consts{
	
	private Consts(){} 
	public static final String PROPERTY_FILE_JDBC = "jdbc.properties";
	
	
	public static final String SEX_MALE = "1";
	public static final String SEX_FEMALE = "2";
	
	public static final char RELATION_IS_FATHER = '1';
	public static final char RELATION_IS_MOTHER = '2';
	public static final char RELATION_IS_SON = '3';
	
	
	public static StringBuffer BASE_API_URI = new StringBuffer("http://127.0.0.1:8080/api");
}