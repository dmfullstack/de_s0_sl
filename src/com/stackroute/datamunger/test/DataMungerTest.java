package com.stackroute.datamunger.test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.stackroute.datamunger.DataMunger;

public class DataMungerTest {

	private String inputSentence;
	private static DataMunger dataMunger;

	@Before
	public void setup() {
		// setup methods runs, before every test case runs
		// This method is used to initialize the required variables
		dataMunger = new DataMunger();

	}

	@After
	public void teardown() {
		// teardown method runs, after every test case run
		// This method is used to clear the initialized variables
		dataMunger = null;

	}

	@SuppressWarnings("deprecation")
	@Test
	public void testFourWords() {

		assertEquals(
				"Incorrect word count. Please note that we will have to split the string on the basis of spaces as words are separated on the basis of spaces",
				5, dataMunger.getWordCount("this is a sample sentence"));

	}

	
	
	@SuppressWarnings("deprecation")
	@Test
	public void testEmptyString() {

		assertEquals(
				"Incorrect word count. Please note that an empty string should return a word count of zero",
				0, dataMunger.getWordCount(""));

	}
	
	

}