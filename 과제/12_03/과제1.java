
[1] 다음 중 기본형 이 아닌 것은 (primitive type) ?
     a. int     b. Byte     c. double      d. boolean
     

    b
     
[2] 다음 문장들의 출력결과를 적으세요.오류가 있는 문장은 오류라고 적으시오?
   System.out.println(1+2);//3
   System.out.println('1'+'2'); //3
   System.out.println("1"+"2"); //12
   System.out.println("~~ "+1+2); //~~ 12
   System.out.println(1+2+"~~"); // 3~~
   System.out.println("Hello"+"java"+'!'); //Hellojava! 
   
    
       
[3] 다음 중 변수의 이름으로 사용할 수 있는 것은 모두 고르시오 ?
  a. $ystem	o
  b. num#5	x
  c. 7num	x
  d. 자바	o
  e. new	x
  f. new_	o
  g. $MAX_NUM	o
  h. hello@com	x		
  
       
[4] 다음중 변수를 잘못 초기화 한 것은 모두 고르시오 ?  a,c
  a. byte b = 256; 
  b. char c = ''; 
  c. char answer = 'no'; 
  d. float f = 3.14;  
  e. double d = 1.4e3f;

  
   
    
 
[5] 다음 연산의 실행 결과는? 

public class Prob2_2 {
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A' 65 
		System.out.println(y >= 5 || x < 0 && x > 2);    //true 
		System.out.println( !('A' <= c && c <='Z') );    //false 
		System.out.println('C'-c);      //2                  
		System.out.println('5'-'0');    //5                  
		System.out.println(c+1);   //66                      
		System.out.println(++c);   //B                       
		System.out.println(c++);   //B                       
		System.out.println(c);     //C                       
	}
} 



==== 여기서 부터는 제출하세요 ======

public class Prob1 {
	public static void main(String[] args) {
/*
 아래는 변수 num의 값에따라  양수 음수  0을 출력하는  코드이다.
삼항 연산자를 이용해서 에 알맞은 코드를 완성하세요. 
힌트:   삼항 연산자를 두번 이용   
*/
	int num = -90;
	System.out.println(num > 0? "양수":(_______________________));


	/*
        다음은 대문자를 소문자로 변경하는 코드입니다.
        변수 ch에 저장된 문자가 대문자 인 경우에만 
	소문자로 변경하는 코드를 완성 합니다.
  	*/
	char ch = 'P';
	char lowerCase = ________삼항 연산 자로 처리________;
	System.out.print("ch:"+ch);
	System.out.println(" to lowerCase :"+lowerCase);
	}
}          

 
