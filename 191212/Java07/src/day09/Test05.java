package day09;

public class Test05 {
	public static void main(String[] args) {
		System.out.println("start");
		
		String msg = "-10";
		int num = 0;
		int res = 0;
		try {
		   num = Integer.parseInt(msg);
		   res = 1000/num;
		   int[] number = new int[num];  
		   //�ڿ��ݳ��ڵ�   X
		}catch (NumberFormatException e) {
            System.out.println("�����߻� : "+e);
            System.out.println("���ڷ� �Էµ� ���ڿ��� �Է��ϼ���");
		}catch (ArithmeticException e) {
			System.out.println("0�� ������  ���ڷ� �Էµ� ���ڿ��� �Է��ϼ���");
		}catch (Exception e) {
			//e.printStackTrace();
			//System.out.println(e);
			System.out.println("�����߻�  : "+e);
		}finally {
			System.out.println("�ڿ��ٳ��ڵ�  �׻� ���� ");
		}
		
		
		System.out.println(num);
		System.out.println(res);
		System.out.println("end");
	}
}
