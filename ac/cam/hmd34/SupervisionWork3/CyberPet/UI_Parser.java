package uk.ac.cam.hmd34.SupervisionWork3.CyberPet;

public class UI_Parser{
	private Owner owner;
	private Text_UI text_ui;
	private String nextCommand;
	boolean cont;
	public void update(){
		if (owner != null) {
			owner.update()
			}
		}
	public UI_Parser(){
		text_ui = new Text_UI();
		}
	public newGame(){
		int y = Integer.parseInt(text_ui.getCommand());
		owner = new Owner(i);
		}
	public parse(String x){
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
		while cont {
			update();
			nextCommand = text_ui.getCommand();
			parse(nextCommand);
			}
		}
	public void Main(String[] args){
		UI_Parser ui_parser = new ui_parser();
		ui.parser.gameLoop();
		}
	}
		