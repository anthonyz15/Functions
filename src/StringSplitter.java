/**
 * 
 * @author Enrique A. Marrero Torres
 *
 */
public class StringSplitter {
	private String theString;   // the string to split
	private int cursor;         // index of current character in the string
	public StringSplitter(String theString) { 
		this.theString = theString; 
		cursor = 0; 
		
		// position the cursor to the index of the first word in the string
		positionCursorAtNextWord(); 
	}
	
	/**
	 * Sets the value of cursor to the index where the next word in 
	 * the string begins. If no such word, the cursor ends up being
	 * equal to theString.length()+1. 
	 */
	private void positionCursorAtNextWord() { 
		while (cursor < theString.length() &&
				(!Character.isLetter(theString.charAt(cursor))))
				cursor++; 		
	}
	

	/**
	 * Get the next word from the string; the word that begins at 
	 * index position equal to the current value of cursor.
	 * @return string corresponding to the next word. If such word 
	 * does not exist it returns reference to the empty string. 
	 */
	public String nextWord() { 
		// Precondition: the current character at position index cursor
		// is a letter...
		String word = ""; 
		while (cursor < theString.length() && 
				Character.isLetter(theString.charAt(cursor))) { 
			word = word + theString.charAt(cursor); 
			cursor++; 
		}
		positionCursorAtNextWord(); 
		
		return word; 
	}
	/**
	 * Splits the string into different words.
	 * @param s string entered by the user.
	 */
public void splitString(String s) { 
	System.out.println("\n\nThe words in the string \"" + s + "\" are: "); 
	StringSplitter sp = new StringSplitter(s); 
	
	String word = sp.nextWord(); 
	while (!word.equals("")) { 
		System.out.println(word);
		word = sp.nextWord(); 
	}
}}
