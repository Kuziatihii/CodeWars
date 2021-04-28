/*
The goal of this exercise is to convert a string to a new string where each character in the new string is 
"(" if that character appears only once in the original string, or ")" if that character appears more than once in the original string. 
Ignore capitalization when determining if a character is a duplicate.
*/
class DuplicateEncoder {
	static String encode(String word){
		char[] wordToChar = word.toLowerCase().toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < wordToChar.length; i++){
			char latter = '(';
			for(int j = 0; j < wordToChar.length; j++){
				if(wordToChar[i] == wordToChar[j] && i!=j){
					latter = ')';
				}
			}
			sb.append(latter);
		}
		return sb.toString();
	}
	public static void main(String[] args){
		System.out.println(encode("Prespecialized"));
	}										 
}
		
										