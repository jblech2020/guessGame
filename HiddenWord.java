public class HiddenWord {
	
	String hiddenWord;
	String hint;
	String guess;
	
	public void HiddenWord(String hiddenWord) {
		this.hiddenWord = hiddenWord;
	}
	
	public String getHint(String guess) {
		for (int i = 0; i<=this.hiddenWord.length(); i++) {
			if (guess.charAt(i)==this.hiddenWord.charAt(i)) {
				hint += this.hiddenWord.substring(i, i+1);
			} else if (this.hiddenWord.contains(guess.substring(i, i+1))) {
				hint += "+";
			} else if (!this.hiddenWord.contains(guess.substring(i, i+1))) {
				hint += "*";
			}
		}
		
		return hint;
	}
	
}