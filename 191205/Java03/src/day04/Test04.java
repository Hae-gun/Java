package day04;

public class Test04 {

	public static void main(String[] args) {
			
			int[] eng;//�迭 ����
			eng = new int[5];//�迭 ���� -> �޸𸮿� �������� ������ �Ҵ��� �ȴ�.
			
			//�迭�� default 0���� �ʱ�ȭ �ȴ�.
			
			
			
			
			eng[0] = 99;
			eng[1] = 88;
			eng[2] = 100;
			eng[3] = 81;
			eng[4] = 67;
			
			double sum=0;
			double avg=0.0;
			
			for(int i=0; i<eng.length;i++) {
				System.out.print(eng[i]+" \n");
				sum +=eng[i];
				
			}
			avg = sum/eng.length;
			
			System.out.printf("�հ� = %d \n",(int)sum);
			System.out.printf("��� = %.2f \n",avg);
			
			
			String[] names = new String[5]; //�迭�� �ڵ����� �ʱ�ȭ. String(������)�� ��� null�� �ʱ�ȭ �ȴ�.
			
			names[0] = "��浿";
			names[1] = "";
			names[2] = "�̱浿";
			names[3] = "�ֱ浿";
			names[4] = "��浿";

			
			for(int i = 0; i<names.length; i++) {
				
				if(names[i] != null&&names[i].length()>0) // null üũ�� �����ؾ� ������ ������ �ʴ´�. ���� false�� �ڿ��� ó������ �ʱ� ����.
				System.out.print(names[i].charAt(0)+"** ");
				System.out.print("��������: "+eng[i]);
				if(eng[i]<avg) {
					System.out.println(" =>�������");
				}else {
					System.out.println();
					}
				
				
			
			}			
			
					
		}
		
	}


