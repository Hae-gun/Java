
[1] ���� �� �⺻�� �� �ƴ� ���� (primitive type) ?
     a. int     b. Byte     c. double      d. boolean
     

    b
     
[2] ���� ������� ��°���� ��������.������ �ִ� ������ ������� �����ÿ�?
   System.out.println(1+2);//3
   System.out.println('1'+'2'); //3
   System.out.println("1"+"2"); //12
   System.out.println("~~ "+1+2); //~~ 12
   System.out.println(1+2+"~~"); // 3~~
   System.out.println("Hello"+"java"+'!'); //Hellojava! 
   
    
       
[3] ���� �� ������ �̸����� ����� �� �ִ� ���� ��� ���ÿ� ?
  a. $ystem	o
  b. num#5	x
  c. 7num	x
  d. �ڹ�	o
  e. new	x
  f. new_	o
  g. $MAX_NUM	o
  h. hello@com	x		
  
       
[4] ������ ������ �߸� �ʱ�ȭ �� ���� ��� ���ÿ� ?  a,c
  a. byte b = 256; 
  b. char c = ''; 
  c. char answer = 'no'; 
  d. float f = 3.14;  
  e. double d = 1.4e3f;

  
   
    
 
[5] ���� ������ ���� �����? 

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



==== ���⼭ ���ʹ� �����ϼ��� ======

public class Prob1 {
	public static void main(String[] args) {
/*
 �Ʒ��� ���� num�� ��������  ��� ����  0�� ����ϴ�  �ڵ��̴�.
���� �����ڸ� �̿��ؼ� �� �˸��� �ڵ带 �ϼ��ϼ���. 
��Ʈ:   ���� �����ڸ� �ι� �̿�   
*/
	int num = -90;
	System.out.println(num > 0? "���":(_______________________));


	/*
        ������ �빮�ڸ� �ҹ��ڷ� �����ϴ� �ڵ��Դϴ�.
        ���� ch�� ����� ���ڰ� �빮�� �� ��쿡�� 
	�ҹ��ڷ� �����ϴ� �ڵ带 �ϼ� �մϴ�.
  	*/
	char ch = 'P';
	char lowerCase = ________���� ���� �ڷ� ó��________;
	System.out.print("ch:"+ch);
	System.out.println(" to lowerCase :"+lowerCase);
	}
}          

 
