package day02;
import java.*;
public class test06 {
	
	

	public static void main(String[] args) {

			int num = 99;
			num = num + 1;
			num += 1;
			System.out.println(num);
			System.out.println(num % 10); //101 % 10 => 1
			System.out.println(num / 10); //101 / 10 => 10
			System.out.println(++num);//
			System.out.println("----------------");
			System.out.println(num++);//
			
			System.out.println("----------------");
			
			int jumsu = 70;
				
				boolean flag = jumsu >= 80;
				
				System.out.println("우수? "+ flag );
			
				flag = jumsu >= 0 && jumsu <= 100;
			
				System.out.println("유효성 ? "+ flag);
			
			
				System.out.println("----------------");
				System.out.printf("%c %d %n", '0',(int)'0');
				System.out.printf("%c %d %n", '1',(int)'1');
				System.out.printf("%c %d %n", 'A',(int)'A'); //65
				System.out.printf("%c %d %n", 'a',(int)'a'); //97
				System.out.printf("%c %d %n", 'Z',(int)'Z'); 
				// 소문자 => 대문자 소문자인경우- 32

				
				System.out.println("----------------");
				char c = 'c';
				System.out.printf("숫자? %b %n",Character.isDigit(c));
				flag = c>='0' && c<='9';
				System.out.printf("숫자? %b %n",flag);
				
				flag = c>='a' && c<='z';
				System.out.printf("소문자? %b %n",flag);
				
				
				flag = c>='A' && c<='Z';
				System.out.printf("대문자? %b %n",flag);
				System.out.printf("%c => %c %n ",c ,(char)(c-32));
				
				//삼항연산자
				
				int score = 70;
				String result ="";
				result = score >= 70 ? "패스":"재시험";

				
				System.out.println(score + " : "+result);
				System.out.println("----------------");

				char ch = 'D';
				
				
				char change = (ch>='a'&&ch<='z')?(char)(ch-32):(char)((ch>='A'&&ch<='Z')?(char)(ch+32):(char)ch);
				
				System.out.printf("%c => %c",ch,change);
				
				
				
				
				
				
//			int a = 0;
//			String B = "";
//			
//			while(num!=1) {
//				 			
//				a= num%2;
//				B +=a;
//				num /=2;
//				
//			}
//			
//			String C = new StringBuffer(B) .reverse().toString();
//		System.out.println(C);
	}

	

}
