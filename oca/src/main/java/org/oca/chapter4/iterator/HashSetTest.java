package org.oca.chapter4.iterator;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HashSetTest {
	
	public static void main(String[] args) {
		String pangram = "this is my first message using treeset for my oca this this year yes or yes";
		Set<Character> setCharacter = new HashSet<>();
		
		System.out.print("Size of Set: ");
		for(char character: pangram.toCharArray()){
			setCharacter.add(character);
			System.out.print(setCharacter.size()+", ");
		}
		System.out.println("\nAll Set with Character: "+ setCharacter);
		
		Set<Double> setDouble = new HashSet<>();
		while(setDouble.size() < 100000){
			setDouble.add(new Random().nextDouble()*100);
		}
		System.out.println("\nAll Set with Doubles: "+ setDouble);
	}
}