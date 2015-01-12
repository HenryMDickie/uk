package uk.ac.cam.hmd34.hangman;

import uk.ac.cam.hmd34.hangman.Headsman;
import uk.ac.cam.hmd34.hangman.Stat_Keeper;

public class PlayerUI implements GameUI{
	private String next_command;
	private Headsman executioner;
	private boolean continuing;
	private int difficulty;
	private void getCommand(){
		next_command = System.console().readLine();
		}
	public void update(){
		int[] xs = executioner.update();
		if (xs[0]>0){ winGame(xs[1]);}
		if (xs[0]<0){ loseGame();}
		}
	private void winGame(int number_guesses){
		Stat_Keeper.addWin(number_guesses);
		System.out.println("You have won the game, but are still executed. You're a murderer, did you really think they would let you go if you won a word game?");
		executioner = null;
		}
	private void loseGame(){
		Stat_Keeper.addLoss();
		System.out.println("You have lost. The crowd goes wild as the hangman pulls the lever and the floor drops out from under you.");
		executioner = null;
		}
	private void guess(String[] g){
		String f;
		if (g.length < 2){
			f = System.console().readLine();
			}
		else {
			f = g[1];
			}
		if (executioner != null){
			executioner.guess(f.toLowerCase());
			}
		else {
			executioner = new Headsman(difficulty);
			executioner.guess(f.toLowerCase());
			}
		}
	public void newGame(){
		if (executioner != null){
			loseGame();
			}
		executioner = new Headsman(difficulty);
		System.out.println("You have been brought before the gallows, and theonly way out is to beat the hangman!");
		}
	public void menu(){
		if (executioner != null){ loseGame();}
		System.out.println("Welcome to Hangman");
		System.out.println("-------------------");
		System.out.println("Type new for newgame, guess to guess, menu to return to the menu, help for help, difficulty to change difficulty, quit to quit, and stats to show shats");
		}
	public void quit(){
		if (executioner !=null){ loseGame();}
		Stat_Keeper.saveStats();
		continuing = false;
		}
	public void changeDiff(String[] comm){
		String f;
		if (comm.length < 2){
			f = System.console().readLine();
			}
		else {
			f = comm[1];
			}
		difficulty = Integer.parseInt(f);
		if (difficulty > 20){ difficulty = 20;}
		if (difficulty < 0){difficulty = 0;}
		}
	public void giveHelp(){
		System.out.println("You're a murderer, you think your executioner will help you?");
		}
	public void shStats(){
		Stat_Keeper.showStats();
		}
	public void parseCommand(String command){
		String[] commands = command.split(" ");
		switch (commands[0]) {
			case "guess": case "g":
				guess(commands);
				break;
			case "new": case "n":
				newGame();
				break;
			case "stats": case "s":
				shStats();
				break;
			case "menu": case "m":
				menu();
				break;
			case "help": case "h":
				giveHelp();
				break;
			case "quit": case "q":
				quit();
				break;
			case "difficulty": case "d":
				changeDiff(commands);
				break;
				
			}
		}
	private void gameLoop(){
		while (continuing){
			getCommand();
			parseCommand(next_command);
			if (executioner != null){
				update();
				}
			}
		}
	private PlayerUI(){
		continuing = true;
		System.out.println("Welcome to Hangman");
		System.out.println("-------------------");
		System.out.println("Type new for newgame, guess to guess, menu to return to the menu, help for help, difficulty to change difficulty, quit to quit, and stats to show shats");
		System.out.println("Please choose difficulty 1-20");
		difficulty = Integer.parseInt(System.console().readLine());
		gameLoop();
		}
	public static void main(String[] args){
		PlayerUI game = new PlayerUI();
		}
	}
			
		