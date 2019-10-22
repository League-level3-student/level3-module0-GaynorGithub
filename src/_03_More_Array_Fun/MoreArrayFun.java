package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		
		String[] strings = {"Waffle","Pizza","Josh","Jackie","Saw","Snow","Tundra","Cabin"};
		
		printStrings(strings);
		//reverseStrings(strings);
		//everyOther(strings);
		//randomStrings(strings);
		
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void printStrings(String[] strings) {
		//for (int i = 0; i < strings.length; i++) {
		//	System.out.println(strings[i]);
		//}
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++){
		  arr[i] = i;
		}
		
		System.out.println(arr[5]);

		System.out.println("");
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	
	public static void reverseStrings(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[7-i]);
		}
		System.out.println("");
		
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void everyOther(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			if(i%2 == 1) {
				System.out.println(strings[i]);
			}
		}
		System.out.println("");
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public static void randomStrings(String[] array) {
		Random rand = new Random();
		boolean[] printed = new boolean[array.length];
		int amount = array.length;
		
		while (amount > 0) {
			int index = rand.nextInt(array.length);
			if(!printed[index]) {
				System.out.println(array[index]);
				printed[index] = true;
				amount--;
			}
		}
		System.out.println("");
	}
	
}
