package com.corejava.collections;
import java.util.*;

public class April28_SetQueueMap {

	public static void main(String[] args) {
		charOccurancesInString();

	}
	
	
	public static void hashMapEx1()
	{
		Map<Character,String> hm1 = new HashMap<Character, String>();
		
		Map<Integer,String> hm = new HashMap<Integer, String>();
		
		hm.put(101, "Ramu");
		hm.put(102, "Rakesh");
		hm.put(103, "Ramu");
		hm.put(104, "Smith");
		hm.put(102, "Ankit");
		
		
		System.out.println(hm);		
		
		System.out.println(hm.get(102));
		
		Set<Integer> kSet = hm.keySet();
		
		System.out.println(kSet);
		
		System.out.println(hm.values());
		
		System.out.println(hm.containsKey(104));
		
		System.out.println(hm.containsValue("Smith"));
		
		
		
	}
	
	
	public static void charOccurancesInString()
	{
		String s = "selenium";
		
		int counter = 1;
		HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
		
		for( int x=0; x<s.length(); x++)
		{
			Character c = s.charAt(x);
			
			if(hm.containsKey(c))
			{
				counter++;
			}
			else
			{
				hm.put(c,counter);
			}
			
		}
		
				
			System.out.println(hm);	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void queueEx1()
	{
		Queue<String> pq = new PriorityQueue<String>();
		
		pq.add("selenium");
		pq.add("Automation");
		pq.add("Testing");
		pq.add("Java");
		
		System.out.println(pq);
		
		System.out.println(pq.peek());
		
		System.out.println(pq);
		
		System.out.println(pq.poll());
		
		System.out.println(pq);
		
		System.out.println(pq.poll());		
		System.out.println(pq.poll());		
		System.out.println(pq.poll());		
		System.out.println(pq.size());
		
	}
	
	
	public static void setEx2()
	{
		Mobile m1 = new Mobile(3, "Black", 8000.50);
		Mobile m2 = new Mobile(2, "White", 6500.80);
		Mobile m3 = new Mobile(3, "Red", 1000.20);
		Mobile m4 = new Mobile(5, "Gray", 15000.50);
		
		System.out.println(m1.equals(m3));
		
		Set<Mobile> mSet = new HashSet<Mobile>();
		
		mSet.add(m1);
		mSet.add(m2);
		System.out.println(mSet.add(m3));
		mSet.add(m4);
		
		System.out.println(mSet);
		
	}
	
	public static void setExample1()
	{
		Set<String> hSet = new HashSet<String>();
		
		hSet.add("Selenium");
		hSet.add("Java");
		hSet.add("Testing");
		hSet.add("Devops");
		System.out.println(hSet.add("Java"));
		
		System.out.println("Java".equals("Java"));
		
		System.out.println(hSet);
		
		Iterator<String> itr = hSet.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
//		
//		for(String m :hSet)
//		{
//			System.out.println(m);
//		}
		
		
		
		
	}
	
	public static void subListEx1()
	{
		String s = "selenium";
		System.out.println(s.substring(1));
				
		System.out.println(s.substring(1, 5));
		
		List<String> al = Arrays.asList(new String[] {"selenium","Java","automation","testig"});
		System.out.println(al);
		
		List<String> al1 = al.subList(1, 3);
		
		System.out.println(al1);
	}

}
