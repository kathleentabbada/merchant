package com.ibm.cams.gh.bankonline.cams_gh_bankonline.domain;
import javax.persistence.*;

@Entity

@Table(name = "merchant_tbl")

public class Merchant {
	@Id
	@Column(name = "merch_id", unique = true, columnDefinition = "VARCHAR(10)", nullable = false)
	String merch_id;

	@Column(name = "merch_name")
	private String merch_name;

	public Merchant() {

	}

	public Merchant(String merch_name) {
		this(null, merch_name);
	}

	public Merchant(String merch_id, String merch_name) {
		this.merch_id = merch_id;
		this.merch_name = merch_name;
	}

	public String getMerch_id() {
		return merch_id;
	}

	public void setMerch_id(String merch_id) {
		this.merch_id = merch_id;
	}

	public String getMerch_name() {
		return merch_name;
	}

	public void setMerch_name(String merch_name) {
		this.merch_name = merch_name;
	}

//	public static String getRandomAlpha() {
//        Random r = new Random();
//        int offset = r.nextInt(character.length());
//        return character.substring(offset, offset+3);
//    }
//    public static int getRandomNum()
//	{
//    	number = (int)((Math.random() * 900)+100);
//		return number;
//	}
//    public static String getRandomAlpha2() {
//        Random r = new Random();
//        int offset = r.nextInt(character.length());
//        return character.substring(offset, offset+2);
//    }
//    public static int getRandomNum2()
//	{
//    	number = (int)((Math.random() * 90)+10);
//		return number;
//	}
//    
	@Override
	public String toString() {
		return String.format("Merchant[merch_id='%s', merch_name='%s']", merch_id, merch_name);
	}

}
