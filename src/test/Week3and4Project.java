package test;

import java.util.Arrays;

public class Week3and4Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] numArray = {3, 9, 23, 64, 2, 8, 28, 93}; 
		System.out.println(Arrays.toString(numArray));
		//Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). 
		int subtract = numArray[numArray.length - 1] - numArray[0];
		//	
			System.out.println(subtract);
		//Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		int[] addAge = Arrays.copyOf(numArray, numArray.length + 1);
		addAge[addAge.length - 1] = 19;
			System.out.println(Arrays.toString(addAge));
		int subtract2 = addAge[addAge.length - 1] - addAge[0];
		System.out.println(subtract2);
		//Use a loop to iterate through the array and calculate the average age. Print the result to the console.
			int sum = 0;
			for (int i = 0; i < numArray.length; i++) {
			sum += numArray[i];}	
			double average = (double) sum / numArray.length;
			System.out.println("The average is: " + average);
		
		//Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			System.out.println(Arrays.toString(names));
		//Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
			int wordLength = 0;
			for (int j = 0; j < names.length; j++) {
			wordLength += names[j].length();}
			double wordAverage = (double) wordLength / names.length;
			System.out.println("The average is: " + wordAverage);
		//Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
			String concatenated = "";
			for (int k = 0; k < names.length; k++) {
			    concatenated += names[k] + " ";}
			System.out.println(concatenated);
		
		//Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		int[] nameLengths = new int[names.length]; 
			for (int i = 0; i < names.length; i++) {
				nameLengths[i] = names[i].length();}
			System.out.println("The lengths of each name above: " + Arrays.toString(nameLengths));
		//Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
			int nameSum = 0;
			for (int f = 0; f < names.length; f++) {
				nameSum += nameLengths[f];
			}
			System.out.println("The sum of the above values is: " + nameSum);
			//Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
			System.out.println(concat("Hello", 5));
			
			//Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
			System.out.println(fullName("Lebron","James"));
			
			//Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
			int[] nums = {1, 3, 5, 7, 9};
	        boolean isGreaterThan100 = greaterThan100(nums);
	        System.out.println("The sum is greater than 100: " + isGreaterThan100);
	        
	       
	        //Write a method that takes an array of double and returns the average of all the elements in the array.
	        double[] num = { 1.5, 2.0, 3.5, 4.0, 5.5 };
	        System.out.println(Arrays.toString(num));
	        System.out.println("The average of the elements in this array is: " + calculateAverage(num));
	
	        //Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	        double[] array1 = {1.0, 2.3, 4.6, 5.7, 6.6};
	        double[] array2 = {1.0, 3.3, 4.4, 4.5, 5.5};
	        System.out.println(compareArray(array1, array2));
	        System.out.println("Array 1 has a larger average than array 2!");
	
	        //Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	        System.out.println(willBuyDrink(true,11.00));
	        
	        //Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	        //This method is meant to recreate the Pythagorean Theorem
	        System.out.println(pythagoreanTheorem(10,12));
	
	}
		
	
		public static String concat(String stringWord, int n) {
			String concat2 = "";
			for (int i = 0; i < n; i++) {
			concat2 += stringWord;
		}
			return concat2;
	}
		public static String fullName(String firstName, String lastName) {
			return firstName + " " + lastName;
		}
		public static boolean greaterThan100 (int[]nums) {
			int sum = 0;
			for (int i = 0; i < nums.length; i++) {
				sum += nums[i];
			}
			return sum > 100;
		}//Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		public static double calculateAverage (double[]num) {
			double sum = 0.0;
			for (int i = 0; i < num.length; i++) 
			{sum+=num[i];
			}return sum / num.length;
		}
		
		public static boolean compareArray (double[]arr1, double[]arr2) {
			if (calculateAverage(arr1)> calculateAverage(arr2)) {
				return true;
			}
			else {
				return false;
			}
		}
		//Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket){
			if ((isHotOutside == true)&&(moneyInPocket > 10.50)){
				return true;
			}else {
				return false;
			}
		}//This method is meant to recreate the Pythagorean Theorem
		public static int pythagoreanTheorem (int a2, int b2) {
			a2 = a2 * a2;
			b2 = b2* b2;
			return a2 + b2;
		}

}
