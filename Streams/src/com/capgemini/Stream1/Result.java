/*Generating random integers and storing in a file and then 
 * reading from it to a collection avoiding duplicacy and maintaining sorting order*/
package com.capgemini.Stream1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Set;
import java.util.TreeSet;

public class Result {
	public static void main(String args[]) throws IOException {
		// Creating a tree set
		Set<Integer> randSet = new TreeSet<Integer>();
		// Writes in the file
		FileWriter filewriter = new FileWriter(new File("boy.txt"));
		for (int i = 1; i < 100; i++) {
			int num = (int) (Math.random() * (49));
			String string = (num + "\n"); // Converts into a string with one number per line
			filewriter.write(string);
		}
		System.out.println("Done");
		filewriter.close(); // Closes the file

		BufferedReader bufferedReader = new BufferedReader(new FileReader("boy.txt"));
		String ln = null;
		while ((ln = bufferedReader.readLine()) != null) {
			// Adds in the treeset
			randSet.add(Integer.valueOf(ln));
		}
		randSet.stream().forEach(i -> System.out.println(i));
		bufferedReader.close();
	}

}
