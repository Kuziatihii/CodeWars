/*

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