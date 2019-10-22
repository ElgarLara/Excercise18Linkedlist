package com.Excercise18Linkedlist.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Stack;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Linkelist {

	public static void main(String[] args, Object Random, Object numbers) {
		// 
		final int ELEMENTS=100;
		LinkedList<Byte> miListita=new LinkedList<Byte>();
		ArrayList<Short> miListita2= new ArrayList<Short>();
		Stack<Integer> miPillita=new Stack<Integer>();
		PriorityQueue<Double> miColita=new PriorityQueue<Double>();
		HashMap<Integer, String> miDiccionaritu =new HashMap<Integer, String>();
	
		Random = numbers new Random();
		miListita.add((byte) 5);
		miListita.add((byte) 10);
		miListita.add((byte) 20);
		miListita.add((byte) 30);
		miListita.add((byte) 40);
		miListita.set(0,(byte) 2);
	
		System.out.println(miListita.get(1));
		System.out.println(miListita);
		/*System.out.println(miListita.remove());
		System.out.println(miListita.remove());
		System.out.println(miListita.remove());
		System.out.println(miListita.remove());*/
		Byte number=2;
		System.out.println(miListita.size());
		System.out.println(miListita.isEmpty());
		System.out.println(miListita.contains(number));
		miListita.clear();
		System.out.println(miListita);
		
		for(int i=0;i<ELEMENTS;i++);
		{
			miListita.add((byte)numbers.nextInt(100));
		}
		System.out.println(miListita);
		Iterator MiTeratorcitu=(Iterator) miListita.iterator();
		while(miIteradorcitu.hasNext())
		{
			System.out.println(miIteradorcitu.next());
		}
		for(Byte miNumber:miListita);
		
		
		


	}

}
