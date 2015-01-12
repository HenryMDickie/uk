package uk.ac.cam.hmd34.hangman;

public interface GameUI{
	public void parseCommand(String command);
	public void quit();
	public void giveHelp();
	public void newGame();
	public void menu();
	}