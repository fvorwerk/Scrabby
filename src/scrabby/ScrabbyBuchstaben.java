package scrabby;

import java.util.ArrayList;

public class ScrabbyBuchstaben {
	
	public static void main (String[] args){
		
		String wort = "Scrabby";
	
		
	}
	
	
	
	// 97 Elemente, 0 = A, 1 = B usw.
	private int [] steincodes = {0,0,0,0,0,1,1,2,2,3,3,3,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,5,5,6,6,6,7,7,7,7,8,8,8,8,8,8,9,10,10,11,11,11,12,12,12,12,13,13,13,13,13,13,13,13,13,14,14,14,15,16,17,17,17,17,17,17,18,18,18,18,18,18,18,19,19,19,19,19,19,20,20,20,20,20,20,21,22,23,24,25};
	// Punkte entsprechend der Reihenfolge im Alphabet
	private int [] bPunkte = {1, 3, 4, 1, 1, 4, 2, 2, 1, 6, 4, 2, 3, 1, 2, 4, 10, 1, 1, 1, 1, 6, 3, 8, 10, 1};
		
	private ArrayList<Character> vorrat;
	
	// todo: Standardkonstruktor anlegen
	// dieser soll die Methode initVorrat aufrufen, um die ArrayList anzulegen
	
	public ScrabbyBuchstaben() {
			
		initVorrat();
		
	}
	
	
	
	private void initVorrat() {
		vorrat = new ArrayList<Character>(steincodes.length);
		for (int i=0; i<steincodes.length; i++)
		{
			vorrat.add(new Character((char) (steincodes[i]+65)));
		}
	}
	
	
	
	public int punkteBerechen(String wort) {
		
		int punkte = 0;
		wort = wort.toUpperCase();
		char[] buchstaben = wort.toCharArray();
		for (int i = 0; i<buchstaben.length; i++){
			if (buchstaben[i] >= 65 && buchstaben[i] <= 90){
				
				punkte = punkte+bPunkte[buchstaben[i]-65];
				
			} else {
				punkte = 0;
				return 0;
			}
			
			
		}
		return punkte;
		
	}
		
	
		
		



}

