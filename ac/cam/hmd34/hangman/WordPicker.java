package uk.ac.cam.hmd34.hangman;

import java.util.Random;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordPicker{
	private static Random randgen;
	private static WordPicker SELF_INSTANCE;
	private static final String DICTIONARY_PATH = "C:\\Users\\Henry\\Documents\\uk\\ac\\cam\\hmd34\\hangman\\words.txt";
	private static final int DICTIONARY_SIZE = 263541;
	private static String[] dictionary;
	private String[] loadDictionary(String path, int size){
		String[] dict = new String[size];
		try{
			BufferedReader dictread = new BufferedReader(new FileReader(path));
			for (int i = 0; i < size; i++){
				dict[i] = dictread.readLine();
				}
			dictread.close();
			}
		catch(IOException e){
			System.out.println("error" + e.getMessage());
			}
		return dict;
		}
	private WordPicker(){
		dictionary = loadDictionary(DICTIONARY_PATH,DICTIONARY_SIZE);
		randgen = new Random();
		}
	public static String getWord(){
		if (SELF_INSTANCE == null){
			SELF_INSTANCE = new WordPicker();
			}
		int select = randgen.nextInt(DICTIONARY_SIZE);
		String word = dictionary[select];		
		return word;
		}
	}