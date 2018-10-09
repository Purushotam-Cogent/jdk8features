package com.jdk8;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ForEach {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<5;i++)
			al.add(i);
		
		al.forEach(new Consumer<Integer>() {
			public void accept(Integer i)
			{
				System.out.println("Value of Integer "+i);
			}
		});
		MyConsumer mm=new MyConsumer();
		al.forEach(mm);
		
		
	}

}

class MyConsumer implements Consumer<Integer>
{

	@Override
	public void accept(Integer arg0) {
		System.out.println("Value of Consumer "+arg0.intValue());
		
	}
	
}
