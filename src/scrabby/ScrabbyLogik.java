package scrabby;

import java.util.ArrayList;
import java.util.Random;

public class ScrabbyLogik {

	private ScrabbyBuchstaben sb;
	private ScrabbyGUI sg;
	
	public ScrabbyLogik(){
		
		sb = new ScrabbyBuchstaben();
		sg = new ScrabbyGUI(this);
		sg.setVisible(true);
		
		
		
	}
	
	
	public int wortAuswerten(String wort){
		
		int punkte = sb.punkteBerechen(wort);
		return punkte;
		
	}
	
	
	public static void main (String[] args){
	
		new ScrabbyLogik();
		
		
	}
	
	public ArrayList<Character> neuesArray(){
		
		
		
	}
	
	
	public ArrayList<Character> erstelleArray(){
			
			
			
	}
	
	public String neuBuchstaben() {
		
		char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		
		for (int q = 0; q <= 10; q++) {
			
			
			for (int i = 0; i < 20; i++) {
			    char c = chars[random.nextInt(chars.length)];
			    sb.append(c);
			}
			
		}
		
		
		String output = sb.toString();
		return output;
		
	}

}