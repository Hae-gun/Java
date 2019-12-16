package day03;

public class TEST01 {

	public static void main(String[] args) {
		String sourceString = "everyday we have is one more than we deserve";
		
		String encoderString = "";
		
		for(int i=0;i<sourceString.length();i++) {
			
			
			if(sourceString.charAt(i)==' ') {
				encoderString += sourceString.charAt(i);
			}else if(sourceString.charAt(i)>='y') {
				encoderString += 'b';
			}else
			encoderString += (char)(sourceString.charAt(i)+3);
		}
		
		System.out.println("암호화할 문자열 : " +sourceString);
		System.out.println("암호화된 문자열 : " +encoderString);
		

	}

}
