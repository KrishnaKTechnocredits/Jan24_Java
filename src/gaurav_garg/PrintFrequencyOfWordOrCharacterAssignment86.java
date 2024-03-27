/*
Print frequency of each character from given input. [using Map]
Print frequency of each word from given input. [using Map]
Print frequency of each number from given input. [using Map]
String str = "technocredits";
String input = "Hi Hello Hi Hello Hello Techno Credits Credits Hello Hi";
int[] data = { 10, 10, 3, 4, 3, 3, 3, 3, 55, 56 };

output = {t=2, e=2, c=2, h=1, n=1, o=1, r=1, d=1, i=1, s=1}
{Hi=3, Hello=4, Techno=1, Credits=2}
{10=2, 3=5, 4=1, 55=1, 56=1
 */
package gaurav_garg;

import java.util.LinkedHashMap;

public class PrintFrequencyOfWordOrCharacterAssignment86 {

	void printFreaquenyEachCharacter(String str)
	{
		char c[]=str.toCharArray();
		LinkedHashMap<Character,Integer> ls= new LinkedHashMap<Character,Integer>();
		for(char name:c)
		{
			if(ls.containsKey(name))
			{
				int count=ls.get(name);
				ls.put(name,count+1);
			}else {
				ls.put(name,1);
			}
		}
		System.out.println(ls);
	}
	
	void printFreaquenyEachWord(String str)
	{
		String str1[]=str.split(" ");
		LinkedHashMap<String,Integer> ls= new LinkedHashMap<String,Integer>();
		for(String name:str1)
		{
			if(ls.containsKey(name))
			{
				int count=ls.get(name);
				ls.put(name,count+1);
			}else {
				ls.put(name,1);
			}
		}
		System.out.println(ls);
	}
	
	void printFreaquenyEachNumber(int [] str)
	{
	
		LinkedHashMap<Integer,Integer> ls= new LinkedHashMap<Integer,Integer>();
		for(int name:str)
		{
			if(ls.containsKey(name))
			{
				int count=ls.get(name);
				ls.put(name,count+1);
			}else {
				ls.put(name,1);
			}
		}
		System.out.println(ls);
	}
	
	
	public static void main(String[] args) {
		String str="technocredits";
		new PrintFrequencyOfWordOrCharacterAssignment86().printFreaquenyEachCharacter(str);
		String input = "Hi Hello Hi Hello Hello Techno Credits Credits Hello Hi";
		new PrintFrequencyOfWordOrCharacterAssignment86().printFreaquenyEachWord(input);
		int[] data = { 10, 10, 3, 4, 3, 3, 3, 3, 55, 56 };
		new PrintFrequencyOfWordOrCharacterAssignment86().printFreaquenyEachNumber(data);
	}
}
