package day06;

/**
 * 
 * @author ������
 *@since 2019.12.09
 *
 */


public class Account {

	private String name;
	private String number;
	private int money;
	
	public Account() {
		this("", "", 0);// ù��° ���ο����� ���Ǵ� �����̴�. �������ڴ� ������ ���ڿ����� ���.
//		setNumber("");
//		setNumber("");
//		setName("");
//		setMoney(0);
	}
	
	public Account(String number, String name, int money) {
		
		setNumber(number);
		setName(name);
		setMoney(money);
	}
	
	
	
//Source generate getter setter	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	/**
	 * 
	 * @param money �Աݱݾ�
	 */
	public void input(int money){
		
		this.money += money;
			
	}

	/**
	 * 
	 * @param money ��ݱݾ�
	 * @return ��ݱݾ�
	 */
	
	public int output(int money){
		
		if(this.money>=money) {
			this.money -= money;
			return money;
		}else {
			System.out.println("�ܰ� �����մϴ�.");
			return 0;
		}
	}
	/**
	 *  �������� ���
	 */
	void print(){
		System.out.printf("[%s(%s) �ܰ�:  %7d��]%n",number,name,money);
	}
	/**
	 * 
	 * @param from ��� ����
	 * @param to   �Ա� ����
	 * @param money ��ݱݾ�
	 */
	public static void transfer(Account from, Account to,int money) {
		System.out.println("������ü");
		System.out.println(from.number+" -> "+to.number);
		to.input(from.output(money));
	}
	
	
		
}
