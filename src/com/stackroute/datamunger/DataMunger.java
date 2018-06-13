package com.stackroute.datamunger;

import java.util.Scanner;

public class DataMunger {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String inputSentence;
		/* read a sentence from the user */
		System.out.println("Please enter a sentence:");
		System.out.println("");
		inputSentence = scanner.nextLine();
		DataMunger dataMunger = new DataMunger();
		/*
		 * call getWordCount() method which should return no. of words present
		 * in the string
		 */
		System.out.println("No. of words:" + dataMunger.getWordCount(inputSentence));

	}

	/*
	 * This method is used to calculate the no. of words present in the given
	 * string. Please note that in a sentence, words are split by space
	 */
	public int getWordCount(String inputSentence) {

		if (inputSentence.equals("") || inputSentence.isEmpty()) {
			return 0;
		}
		String[] words = inputSentence.split(" ");
		return words.length;
	}

}
