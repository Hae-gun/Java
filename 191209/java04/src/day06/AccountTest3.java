package day06;


import javax.swing.JOptionPane;

public class AccountTest3 {

	public static void main(String[] args) {



		Account[] accounts = {
				new Account("2019-12-09-001","ȫ�浿",110),
				new Account("2019-12-09-002","��浿",7000),
				new Account("2019-12-09-003","�̱浿",6000),
				new Account("2019-12-09-004","��浿",9000),
				new Account("2019-12-09-005","�ֱ浿",3200),
				new Account("2019-12-09-006","�ڱ浿",1000),
				new Account("2019-12-09-007","�ű浿",5000),
				new Account("2019-12-09-008","�۱浿",8000)
		};
		
		System.out.println("Account List  ");
		for(int i=0; i<accounts.length;i++) {
			accounts[i].print();
		}
		
		System.out.println("Account �˻�  ");
		String name = JOptionPane.showInputDialog("�˻��̸��� �Է��ϼ���.");
		
		for(int i=0; i<accounts.length;i++) {
			if(name.trim().equals(accounts[i].getName()))
			accounts[i].print();
		}
	}

}
