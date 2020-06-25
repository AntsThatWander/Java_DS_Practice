package CC;

public class CC {
	private char[] UpperEncoding;
	private char[] LowerEncoding;
	private int key;
	
	public CC(int key) {
		UpperEncoding = new char[26];
		LowerEncoding = new char[26];
		this.key = key;
		for(int i=0; i<26; i++) {
			if(i+key<26) {
				UpperEncoding[i+key] = (char) ('A' + i);
				LowerEncoding[i+key] = (char) ('a' + i);
			}
			else {
				UpperEncoding[(i+key)-26] = (char) ('A' + i);
				LowerEncoding[(i+key)-26] = (char) ('a' + i);
			}
		}
	}
	
	public String ListEncoder() {
		String basicString = "Key: " + key;
		basicString += "\n";
		for(int i=0; i<26; i++) {
			basicString += (char) ('A'+i) + " to " + UpperEncoding[i] + "\n";
		}
		for(int i=0; i<26; i++) {
			basicString += (char) ('a'+i) + " to " + LowerEncoding[i] + "\n";
		}
		
		
		return basicString;
	}
	
	public String Encoding(String unencoded) {
		String encoded = "";
		
		for(int i=0; i<unencoded.length(); i++) {
			char UnLet = unencoded.charAt(i);
			char EnLet;
			if(UnLet>='A' && UnLet<='Z') {
				EnLet = UpperEncoding[(int)UnLet-'A'];
			}
			else if(UnLet >= 'a' && UnLet <= 'z') {
				EnLet = LowerEncoding[(int)UnLet-'a'];
			}
			else if(UnLet == ' ') {
				EnLet = ' ';
			}
			else {
				EnLet = UnLet;
			}
			encoded += EnLet;
		}
		
		return encoded;
	}
}
