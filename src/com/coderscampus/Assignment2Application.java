package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		main2(args);
		System.exit(0);
		
		Random RandomNumber = new Random();
		int theRandomNumber = RandomNumber.nextInt(101);
		if (theRandomNumber == 0) {
			theRandomNumber = RandomNumber.nextInt(101);
		}

		// Testing ONLY
		System.out.println(theRandomNumber);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Pick a number between 1 and 100");
		Integer convertedInput = Integer.parseInt(scanner.nextLine());

		while (convertedInput < 1 || convertedInput > 100) {
			System.out.println("Your guess is not between 1 and 100, please try again");
			convertedInput = Integer.parseInt(scanner.nextLine());
		}

		// Testing ONLY
//		System.out.println("You number is: " + convertedInput);

//		for (int i = 0; i < 4; i++) {
//			if (convertedInput < theRandomNumber) {
//				System.out.println("Please pick a higher number");
//				convertedInput = Integer.parseInt(scanner.nextLine());
//				while (convertedInput < 1 || convertedInput > 100) {
//					System.out.println("Your guess is not between 1 and 100, please try again");
//					convertedInput = Integer.parseInt(scanner.nextLine());
//				}
//			} else if (convertedInput > theRandomNumber) {
//				System.out.println("Please pick a lower number");
//				convertedInput = Integer.parseInt(scanner.nextLine());
//				while (convertedInput < 1 || convertedInput > 100) {
//					System.out.println("Your guess is not between 1 and 100, please try again");
//					convertedInput = Integer.parseInt(scanner.nextLine());
//				}
//			} else if (convertedInput == theRandomNumber) {
//				System.out.println("You win!");
//			}
//
//		}

		int j = 1;
		while (j < 5) {
			if (convertedInput < theRandomNumber) {
				System.out.println("Please pick a higher number");
				convertedInput = Integer.parseInt(scanner.nextLine());
				while (convertedInput < 1 || convertedInput > 100) {
					System.out.println("Your guess is not between 1 and 100, please try again");
					convertedInput = Integer.parseInt(scanner.nextLine());
				}
				j++;
			} else if (convertedInput > theRandomNumber) {
				System.out.println("Please pick a lower number");
				convertedInput = Integer.parseInt(scanner.nextLine());
				while (convertedInput < 1 || convertedInput > 100) {
					System.out.println("Your guess is not between 1 and 100, please try again");
					convertedInput = Integer.parseInt(scanner.nextLine());
				}
				j++;
			} else if (convertedInput == theRandomNumber) {
				System.out.println("You win!");
				break;
			}

		}

		if (j == 5) {
			if (convertedInput != theRandomNumber) {
				System.out.println("You lose, the number to guess was " + theRandomNumber);
			} else {
				System.out.println("You win!");
			}
		}

		scanner.close();

	}



	
	
	
	
	
	public static void main2(String[] args) {
		Random randomizer = new Random();
		int randomNumber = randomizer.nextInt(101) + 1;
		System.out.println(randomNumber);
		
		Scanner scanner = new Scanner(System.in);

		int guessCounter = 0;  // no guess attempt made yet
		int userGuess = 0;
		while (guessCounter < 5) {
			System.out.println("Pick a number between 1 and 100");
			userGuess = Integer.parseInt(scanner.nextLine());
			
			// validate if valid guess range
			if (userGuess < 1 || userGuess > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again");
				continue; //goes to next iteration of while loop, no increment on the guess counter
			}

			// valid guess range, check correctness
			if (userGuess == randomNumber) {
				System.out.println("You win!");
				break;
			} else if (userGuess < randomNumber) {
				System.out.println("Please pick a higher number");
			} else if (userGuess > randomNumber) {
				System.out.println("Please pick a lower number");
			}
			
			guessCounter++;
		}

		// at this point, we know that if the userGuess is not equal as the random number,
		// we know it exhausted allowed incorrect guesses
		if (userGuess != randomNumber) {
			System.out.println("You lose, the number to guess was " + randomNumber);
		}
		
		scanner.close();
	}
}
