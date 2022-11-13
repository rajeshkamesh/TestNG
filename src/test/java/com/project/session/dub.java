package com.project.session;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class dub {
	public static void main(String[] args) {
		
		int[] i= {1, 20, 30, 20, 10,50};
		
		Set<Object> c = Arrays.stream(i).boxed().collect(Collectors.toSet());// remove dublicates
		Set<Object> c2= new TreeSet<Object>(c);//ascending order
		System.out.println(c2);
		
	}

}
