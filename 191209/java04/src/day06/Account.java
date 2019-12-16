package day06;

/**
 * 
 * @author 최혜근
 *@since 2019.12.09
 *
 */


public class Account {

	private String name;
	private String number;
	private int money;
	
	public Account() {
		this("", "", 0);// 첫번째 라인에서만 허용되는 문장이다. 가변인자는 마지막 인자에서만 허용.
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
	 * @param money 입금금액
	 */
	public void input(int money){
		
		this.money += money;
			
	}

	/**
	 * 
	 * @param money 출금금액
	 * @return 출금금액
	 */
	
	public int output(int money){
		
		if(this.money>=money) {
			this.money -= money;
			return money;
		}else {
			System.out.println("잔고가 부족합니다.");
			return 0;
		}
	}
	/**
	 *  계좌정보 출력
	 */
	void print(){
		System.out.printf("[%s(%s) 잔고:  %7d원]%n",number,name,money);
	}
	/**
	 * 
	 * @param from 출금 계좌
	 * @param to   입금 계좌
	 * @param money 출금금액
	 */
	public static void transfer(Account from, Account to,int money) {
		System.out.println("계좌이체");
		System.out.println(from.number+" -> "+to.number);
		to.input(from.output(money));
	}
	
	
		
}
