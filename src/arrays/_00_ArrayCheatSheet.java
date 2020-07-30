package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] foods = new String[5];
		
		foods[0] = "hamburger";
		foods[1] = "tacos";
		foods[2] = "sushi";
		foods[3] = "chips";
		foods[4] = "gummies";
		//2. print the third element in the array
		//System.out.println(foods[2]);
		//3. set the third element to a different value
		foods[2] = "salmon roll";
		//4. print the third element again
		//System.out.println(foods[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < foods.length; i++) {
			//System.out.println(foods[i]);
		}
		
		//6. make an array of 50 integers
		int[] nums = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random rnd = new Random();
		for (int i = 0; i < nums.length; i++) {
			nums[i]= rnd.nextInt(100);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int small = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < small) {
				small = nums[i];
			}
		}
		System.out.println(small);
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		//10. print the largest number in the array.
		int big = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > big) {
				big = nums[i];
			}
		}
		System.out.println(big);
	}
}
