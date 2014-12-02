package uk.ac.cam.hmd34.SupervisionWork3.CyberPet;

public class UI_Parser{
	private Owner owner;
	private Text_UI text_ui;
	private String nextCommand;
	boolean cont;
	public void update(){
		if (owner != null) {
			owner.update();
			}
		}
	public UI_Parser(){
		text_ui = new Text_UI();
		}
	public void newGame(){
		owner = new Owner();
		}
	public void parse(String x){
		switch (x){
			case "new game": 	newGame();
								break;
			case "feed":		owner.feedPet();
								break;
			case "sleep":		owner.putPetToSleep();
								break;
			case "play":		owner.playWithPet();
								break;
			case "quit":		cont = false;
								break;
			}
		}
	public void gameLoop(){
		cont = true;
		while (cont) {
			update();
			nextCommand = text_ui.getCommand();
			parse(nextCommand);
			}
		}
	public static void main(String[] args){
		UI_Parser ui_parser = new UI_Parser();
		ui_parser.gameLoop();
		}
	}
		