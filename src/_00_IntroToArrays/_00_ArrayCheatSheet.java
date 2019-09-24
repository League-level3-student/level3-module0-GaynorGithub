package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		Random rand = new Random();
		int smallest = 50;
		int largest = 0;
		
		String strings[] = new String[5];
		strings[0] = "Wood";
		strings[1] = "Fired";
		strings[2] = "Pizza";
		strings[3] = "How";
		strings[4] = "Job";
		
		//2. print the third element in the array
		System.out.println(strings[3]);
		//3. set the third element to a different value
		strings[3] = "Pizza?";
		//4. print the third element again
		System.out.println(strings[3]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < strings.length; i++) {
			strings[i] = "Wood Fired Pizza? How will pizza get a job now?";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int j = 0; j < strings.length; j++) {
			System.out.println(strings[j]);
		}
		//7. make an array of 50 integers
		int lots[] = new int[50];
		
		//8. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < lots.length; i++) {
			lots[i] = rand.nextInt(50);
			if (lots[i] < smallest) {
				smallest = lots[i];
			}
			if (lots[i] > largest) {
				largest = lots[i];
			}
		}
		//9. without printing the entire array, print only the smallest number on the array
		System.out.println(smallest);
		System.out.println(largest);
		System.out.println("Spacer");
		//10 print the entire array to see if step 8 was correct
		for (int i = 0; i < lots.length; i++) {
			System.out.println(lots[i]);
		}
		smallest = 50;
		largest = 0;
		//11. print the largest number in the array.
		
		//12. print only the last element in the array
		System.out.println("");
		System.out.println(lots[49]);
	}
}
