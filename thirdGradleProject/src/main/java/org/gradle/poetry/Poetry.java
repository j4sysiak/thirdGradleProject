package org.gradle.poetry;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.codec.binary.Base64;

public class Poetry {
	
	public List<String> juliusCaesar() {
		
		List<String> lines = new ArrayList<String>();
		
		lines.add("11111111111111111111111111");
		lines.add("22222222222222222222222222");
		lines.add("333333333333333333");
		lines.add("44444444444");
		lines.add("555555555555555555555555555555555555555555");
		lines.add("666666666666666666666666666666666666666666666666666666666");
		lines.add("777777777777777");
		
		return lines;
	}
	
	public void emit(List<String> lines){
		
		for(String line : lines){
			System.out.println(encode(line));
		}
	}

	public String encode(String text){
		
		Base64 codec = new Base64();
		return new String(codec.encode(text.getBytes()));
	}
	
	public static void main(String[] args) {
 
		Poetry p = new Poetry();
		p.emit(  p.juliusCaesar()    );
		
	}

}












































