package uk.ac.cam.hmd34.tick2;

public class TinyLife{
	public static boolean getCell(long world, int col, int row){
		boolean check = false;
		int pos = col + (8*row);
		if ((0<=col && col<=7) && (0<=row && row<=7)) {
			check = PackedLong.get(world,pos);
			}
		return check;
		}
	public static long setCell(long world, int col, int row, boolean value){
		int pos = col + (8*row);
		long new_world = world;
		if ((0<=col && col<=7) && (0<=row && row<=7)) {
			new_world = PackedLong.set(world,pos,value);
			}
		return new_world;
		}
	public static int countNeighbors(long world, int col, int row){
		int count = 0;
		for (int i = -1;i<2;i++){
			for (int j = -1;j<2;j++){
				if (getCell(world, col + i, row + j)){
					count ++;
					}
				}
			}
		return count;
		}
	public static boolean computeCell(long world, int col, int row){
		boolean cell = getCell(world,col,row);
		int count = countNeighbors(world,col,row);
		switch (count){
			case 3:		cell = true;
						break;
			case 4: 	break;
			default:	cell = false;
						break;
			}
		return cell;
		}
	public static void print(long world) {
		System.out.println("-");
		for (int row = 0; row < 8 ; row++){
			for (int col = 0; col <8; col++){
				System.out.print(getCell(world,col,row) ? "#" : "_" );
				}
			System.out.println();
			}
		}
	public static long nextGeneration(long world){
		long next_world = 0L;
		for (int i = 0; i<8; i++){
			for (int j = 0; j<8; j++){
				boolean next = computeCell(world,i,j);
				next_world=setCell(next_world,i,j,next);
				}
			}
		return next_world;
		}
	public static void play(long world) throws Exception {
		int userResponse = 0;
		while (userResponse != 'q') {
			print(world);
			world = nextGeneration(world);
			userResponse = System.in.read();
			}
		}
	public static void main(String[] args) throws Exception {
		play(Long.decode(args[0]));
		}
	}