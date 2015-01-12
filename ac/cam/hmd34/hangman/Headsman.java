package uk.ac.cam.hmd34.hangman;

import uk.ac.cam.hmd34.hangman.WordPicker;

public class Headsman{
	private final String CHOSEN_WORD;
	private int number_guesses;
	private int incorrect_guess_number;
	private final int GUESSES_BEFORE_EXECUTION;
	private final String[] current_word;
	private String[] current_guessed_word;
	public void guess(String guess){
		boolean chk = true;
		if ((guess.length() > 1) && (guess.equals(CHOSEN_WORD))){
			current_guessed_word = current_word;
			chk = false;
			}
		else {
			for(int i = 0;i<current_word.length;i++){
				if (guess.equals(current_word[i])){
					current_guessed_word[i] = guess;
					chk = false;
					}
				}
			}
		if (chk){
			incorrect_guess_number++;
			System.out.println("Your guess was incorrect. The gallows loom ever closer as the crowd cheers.");
			}
		else {
			System.out.println("Your guess was correct. You have a small reprieve, but death still looms. The crowd didn't come to see you walk free.");
			}
		number_guesses++;
		return;
		}
	public int[] update(){
		for(int i = 0;i<current_guessed_word.length;i++){
			System.out.print(current_guessed_word[i]);
			}
		System.out.println("");
		System.out.println("You have " + (GUESSES_BEFORE_EXECUTION- incorrect_guess_number) + " guesses remaining");
		int cfk = 0;
		int[] g = new int[2];
		if (current_guessed_word.equals(current_word)){
			cfk = 1;
			}
		else if ((incorrect_guess_number >= GUESSES_BEFORE_EXECUTION)){
			cfk = -1;
			System.out.println("The actual word was " + CHOSEN_WORD);
			}
		g[0] = cfk;
		g[1] = number_guesses;
		return g;
		}
	public Headsman(int difficulty){
		GUESSES_BEFORE_EXECUTION = (20- difficulty);
		CHOSEN_WORD = WordPicker.getWord();
		current_word = CHOSEN_WORD.split("");
		number_guesses = 0;
		incorrect_guess_number = 0;
		current_guessed_word = new String[(current_word.length)];
		for(int i = 0; i< current_word.length; i++){
			current_guessed_word[i] = "-";
			}
		for(int i = 0;i<current_guessed_word.length;i++){
			System.out.print(current_guessed_word[i]);
			}
		System.out.println("");
		}
	}
		
			