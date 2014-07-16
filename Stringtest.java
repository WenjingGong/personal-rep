package stringtest;

import java.io.*;

public class Stringtest {
	
	public static void main(String []args){
		
		String ss;
		String s = "ABCDEFGHIJ";
		String sub = "";
		for (int i=0;i<s.length()/2;i++){
			sub=sub+s.substring(2*i, 2*i+2);	
			if (i<s.length()/2-1){
				sub=sub+":";
			}			
		}
		System.out.println(sub);
	}

}
