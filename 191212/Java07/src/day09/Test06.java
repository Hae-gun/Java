package day09;

public class Test06 {
	public static void main(String[] args) {
		System.out.println("start");
		
		try {
			Thread.sleep(1000); //runtimeException  unchecked, Exception checked->try catch�ʿ���.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("----------------------------");
		
		
		try {
			throw new Exception("���ܽǽ�~~");
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		
		System.out.println("end");
	}
}
