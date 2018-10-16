package com.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CreateStream {
	
	public static void main(String[] args) {
		Stream<Integer> i=Stream.of(1,2,6,9,9,44,12);
	//	System.out.println("Count "+i.count());
		//System.out.println("FindFirst "+i.findFirst());
		//System.out.println("FindAny "+i.findAny());
		
		//System.out.println("Isparallel "+i.isParallel());
		//System.out.println(i);
		//i.forEach(p-> System.out.println(p));
	
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
		
		
		Stream<String> stream1=Stream.generate(()->{return "purushotam";});
		Stream<String> stream2=Stream.iterate("PuruStreamApi",(z)->z);
		

LongStream is = Arrays.stream(new long[]{1,2,3,4});
IntStream is2 = "abc".chars();
is.forEach(p->System.out.println(p));

System.out.println("--------------------------");

is2.forEach(p->System.out.println(p));


		
		//System.out.println("------------- Generate-------------------");
		
		//stream1.forEach(p->System.out.println(p));
		
		//System.out.println("---------------Iterate-------------------");
		//stream2.forEach(p->System.out.println(p));
		
		System.out.println("-------------------------Converting Stream to Collection ------------------------------");
		
		List<Integer> li=i.collect(Collectors.toList());
		System.out.println("List from Stream "+li);
		i=Stream.of(1,2,6,9,44,12);
		Map<Integer, Integer> mi=i.collect(Collectors.toMap(z->z, z->z+10));
		
		System.out.println("Map After Stream Data "+mi);
		
		i=Stream.of(1,2,6,9,44,12);
		
		Set<Integer> set=i.collect(Collectors.toSet());
		System.out.println("Set After Stream Data "+set);
		
		wrapper=Stream.of(new Integer [] {7,7,7,7,7});
		
	Integer [] intarray=wrapper.toArray(Integer[]::new);
	
	System.out.println("Stream to Array via toArray() Method ");
	
	System.out.println(Arrays.toString(intarray));
	
	Stream<String> strStream=Stream.of("A","E","D","B","C","AA");
	System.out.println("Stream.map() Methodn"+strStream.map(s->{
		return s.toLowerCase();
	}).collect(Collectors.toList()));
	
	strStream=Stream.of("A","E","D","B","C","AA");
	
	List<String> namesreverseSorted=strStream.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	System.out.println(namesreverseSorted);
	strStream=Stream.of("A","E","D","B","C","AA");
	List<String> naturalOrderSort=strStream.sorted().collect(Collectors.toList());
	System.out.println(naturalOrderSort);
		
	Stream<List<String>> namesOrgnList=Stream.of(Arrays.asList("Rohit"),Arrays.asList("Jack","John"),Arrays.asList("Suman"),Arrays.asList("Sumit"));
	Stream<String> flatStreamMap=namesOrgnList.flatMap(strList->strList.stream());
	flatStreamMap.forEach(System.out::println);
	
	Stream<Integer> streamNumber=Stream.of(3,6,2,7);
	Optional<Integer> intOptional=streamNumber.reduce((z,j)->{return z*j;});
	if(intOptional.isPresent())
		System.out.println("Multiplication "+intOptional.get());
	
	
	
		
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
