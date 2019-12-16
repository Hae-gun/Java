package mystack;

import java.util.Arrays;

class MyStack{ // stack LIFO-> Last in First out
	// �����Ͻÿ�.
	
	private int[] stack = null;
	private int index = 0;
	
	
	public MyStack() {
		this(10);
	}
	
	
	
	
	public MyStack(int size){
		try {
			stack = new int[size];
		}catch(NegativeArraySizeException e) {
			System.out.println("�����迭 �����Ұ�. size=10 �迭�� �ʱ�ȭ.");
			size = 10;
			stack = new int[size];
		}
		
	}
	
	public void push(int i) {
		if(isFull()) {
			int[] temp = new int[stack.length*2];
			System.arraycopy(stack,0,temp, 0, stack.length);
			stack = temp;
			temp=null;
		}
		
		stack[index++] = i;
		
	}
	public int pop() {
		
		if(isEmpty())return -1;
		
		else return stack[--index];
		
	}
	public boolean isEmpty() {
		
		return index==0?true:false;
		
	}
	public boolean isFull() {
		
		
			return index==stack.length?true:false;
			
	}
	public int top() {
		if(isEmpty())return -1;
		return stack[index-1];
	}



}