package scrabby;

public class ScrabbyLogik {

	private ScrabbyBuchstaben sb;
	private ScrabbyGUI sg;
	
	public ScrabbyLogik(){
		
		sb = new ScrabbyBuchstaben();
		sg = new ScrabbyGUI(this);
		sg.setVisible(true);
		
		
		
	}
	
	public static void main (String[] args){
	
		new ScrabbyLogik();
		
		
	}
	
	


	public String punkteBerechen1(String wort) {
		
		sb.punkteBerechen(wort);
		
		return wort;
		
		


}

}