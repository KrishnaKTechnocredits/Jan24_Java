package technocredits.collectionsframework.setdemo;

import java.util.ArrayList;
import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		String[] arr = {"MauLiK", "Krishna", "Maulik", "Akshay","Akshay","Atisha","Garima","Shramika"};
		Scanner sc = new Scanner(System.in);
		ArrayList<String> listOfNames = new ArrayList<String>();
		for(String name : arr) {
			if(!listOfNames.contains(name)) {
				listOfNames.add(name);
			}else {
				System.out.println("Duplicate name : " + name);
			}
		}
		System.out.println(listOfNames);
	}
}
