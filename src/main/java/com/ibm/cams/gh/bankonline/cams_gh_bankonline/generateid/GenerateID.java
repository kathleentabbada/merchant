package com.ibm.cams.gh.bankonline.cams_gh_bankonline.generateid;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class GenerateID {
	
	public static final String character = "ABCDEFGHIJKMNOPQRSTUVWXYZ" ;
    public static int number = 0;
    public static void main(String[] args) {
    	GenerateID rg = new GenerateID();
        System.out.println("Userid = " + rg.generateid());
         
    }
    
    public String generateid() {
    	return getRandomAlpha() + getRandomNum() + getRandomAlpha2() + getRandomNum2() ;
    }
	
    
    private static String getRandomAlpha() {
        Random r = new Random();
        int offset = r.nextInt(character.length());
        return character.substring(offset, offset+3);
    }
    
    private static String getRandomAlpha2() {
        Random r = new Random();
        int offset = r.nextInt(character.length());
        return character.substring(offset, offset+2);
    }
    public static int getRandomNum()
	{
    	number = (int)((Math.random() * 900)+100);
		return number;
	}
    
    public static int getRandomNum2() {
    	number = (int)((Math.random() * 90)+10);
		return number;
		}
}
