/*
Write a function that takes a string of braces, and determines if the order of the braces is valid. It should return true if the string is valid, and false if it's invalid.

This Kata is similar to the Valid Parentheses Kata, but introduces new characters: brackets [], and curly braces {}. Thanks to @arnedag for the idea!

All input strings will be nonempty, and will only consist of parentheses, brackets and curly braces: ()[]{}.
*/
public class BraceChecker {
	public static boolean isValid(String braces) {
		int s = 0;
		char[] wordToChar = braces.toLowerCase().toCharArray(); 
		int f = 0;
		int l = 1;
		for (int i = 0; i < wordToChar.length; i++){
			if(wordToChar[i] =='{'){
				f = i;
				s++;
				for (int j = i + 1; j < wordToChar.length; j++){
					if(wordToChar[j] =='}'){
						l = j;
						s--;
					}
				}

			
			if((l-f) % 2 == 0 && (l-f) != 1){
				return false;
			}			
			}
		}
		for (int i = 0; i < wordToChar.length; i++){
			if(wordToChar[i] =='('){
				s++;
				f = i;
				for (int j = i + 1; j < wordToChar.length; j++){
					if(wordToChar[j] ==')'){
						l = j;
						s--;
					}
				}

			}
			if((l-f) % 2 == 0 && (l-f) != 1){
				return false;
			}
		}
		for (int i = 0; i < wordToChar.length; i++){
			if(wordToChar[i] =='['){
				s++;
				f = i;
				for (int j = i + 1; j < wordToChar.length; j++){
					if(wordToChar[j] ==']'){
						l = j;
						s--;
					}
				}
			}
			if((l-f) % 2 == 0 && (l-f) != 1){
				return false;
			}
		}
		if (s!=0){
			return false;
		}
		return true;
	}
		public static void main(String[] args){
		System.out.println(isValid("[(])"));
	}
}