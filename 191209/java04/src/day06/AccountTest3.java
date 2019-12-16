package day06;


import javax.swing.JOptionPane;

public class AccountTest3 {

	public static void main(String[] args) {



		Account[] accounts = {
				new Account("2019-12-09-001","홍길동",110),
				new Account("2019-12-09-002","고길동",7000),
				new Account("2019-12-09-003","이길동",6000),
				new Account("2019-12-09-004","장길동",9000),
				new Account("2019-12-09-005","최길동",3200),
				new Account("2019-12-09-006","박길동",1000),
				new Account("2019-12-09-007","신길동",5000),
				new Account("2019-12-09-008","송길동",8000)
		};
		
		System.out.println("Account List  ");
		for(int i=0; i<accounts.length;i++) {
			accounts[i].print();
		}
		
		System.out.println("Account 검색  ");
		String name = JOptionPane.showInputDialog("검색이름을 입력하세요.");
		
		for(int i=0; i<accounts.length;i++) {
			if(name.trim().equals(accounts[i].getName()))
			accounts[i].print();
		}
	}

}
