package uk.ac.cam.hmd34.hangman;

import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Stat_Keeper{
	private static final String STAT_FILE_PATH = "C:\\Users\\Henry\\Documents\\uk\\ac\\cam\\hmd34\\hangman\\stats.txt";
	private static Stat_Keeper SELF_INSTANCE;
	private int number_wins;
	private int number_games;
	private float percentage_wins;
	private float average_guesses_per_win;
	private Stat_Keeper(){
		try {
			BufferedReader stat_read = new BufferedReader(new FileReader(STAT_FILE_PATH));
			number_wins = Integer.parseInt(stat_read.readLine());
			number_games = Integer.parseInt(stat_read.readLine());
			percentage_wins = Float.parseFloat(stat_read.readLine());
			average_guesses_per_win = Float.parseFloat(stat_read.readLine());
			stat_read.close();
			}
		catch(IOException E){
			System.out.println("Stats could not be read");
			}
		}
	public static void showStats(){
		if (SELF_INSTANCE == null){SELF_INSTANCE = new Stat_Keeper();}
		SELF_INSTANCE.shwStats();
		}
	private void shwStats(){
		System.out.println("Wins: " + number_wins);
		System.out.println("Losses: " + (number_games - number_wins));
		System.out.println("Percentage won: " + percentage_wins);
		System.out.println("Average guesses to win: " + average_guesses_per_win);
		}
	private void addWi(int num_guess){
		float f = average_guesses_per_win * (float)number_wins;
		f += (float)num_guess;
		number_wins++;
		average_guesses_per_win = f/ (float)number_wins;
		percentage_wins = 100f *((float)number_wins/(float)number_games);
		}
	private void addLo(){
		number_games++;
		percentage_wins = 100f *((float)number_wins/(float)number_games);
		}
	public static void addWin(int n){
		if (SELF_INSTANCE == null){SELF_INSTANCE = new Stat_Keeper();}
		SELF_INSTANCE.addWi(n);
		}
	public static void addLoss(){
		if (SELF_INSTANCE == null){SELF_INSTANCE = new Stat_Keeper();}
		SELF_INSTANCE.addLo();
		}
	public static void saveStats(){
		SELF_INSTANCE.savStats();
		}
	public void savStats(){
		try{
			PrintWriter stat_write = new PrintWriter(STAT_FILE_PATH);
			stat_write.println(number_wins);
			stat_write.println(number_games);
			stat_write.println(percentage_wins);
			stat_write.println(average_guesses_per_win);
			stat_write.close();
			}
		catch (IOException E){
			System.out.println("Error");
			}
		}
	}