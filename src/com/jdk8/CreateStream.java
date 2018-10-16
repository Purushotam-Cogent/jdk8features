package com.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {
	
	public static void main(String[] args) {
		Stream<Integer> i=Stream.of(1,2,6,9,9,44,12);
	//	System.out.println("Count "+i.count());
		//System.out.println("FindFirst "+i.findFirst());
		//System.out.println("FindAny "+i.findAny());
		
		//System.out.println("Isparallel "+i.isParallel());
		//System.out.println(i);
		i.forEach(p-> System.out.println(p));
	
		Stream<Integer> wrapper=Stream.of(new Integer [] {5,5,5,5,5,5});
		Stream<int[]> datatype=Stream.of(new int [] {7,7,7,7,7});
		
		List<Cogent> al=new ArrayList<>();
		for(int z=10;z<=100;z+=3)
		{
			al.add(new Cogent(z));
			
		}
		
		Stream<Cogent> cogentStream=al.stream();
		
		wrapper.forEach(p->System.out.println(p));
		
		System.out.println("========================================");
		
		
		datatype.forEach(p->printArray(p));
	
		System.out.println("=======================================");
		cogentStream.forEach(p->System.out.println(p));
		
	}
	static void printArray(int i[])
	{
		for(int x=0;x<i.length;x++)
		{
			System.out.println(i[x]);
		}
	}
	
	

}

class Cogent
{
	int id;
	public Cogent()
	{
		this.id=0;
	}
	
	public Cogent(int id)
	{
		this.id=id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cogent[id="+this.id+"]";
	}
}
