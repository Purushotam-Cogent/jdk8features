package com.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import javax.sound.midi.Sequence;

public class JdkStreamApi {
	
	public static void main(String[] args) {
		
		List<Integer> al=new ArrayList<>();
		
		for(int i=0;i<=100;i++)
		{
			al.add(i);
		}
		
		Stream<Integer> seqStream=al.stream();
		
		Stream<Integer> parellalStream=al.parallelStream();
		
		Stream<Integer> hgnum=seqStream.filter(p-> p >90);
		
		hgnum.forEach(p->System.out.println("HighNum Sequence Stream "+p));
		
		hgnum=parellalStream.filter(p-> p>90);
		
		hgnum.forEach(p->System.out.println("HighNum Parallel Stream "+p));		
				
	}

}
