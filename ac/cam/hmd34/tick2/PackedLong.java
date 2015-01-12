package uk.ac.cam.hmd34.tick2;

public class PackedLong {
	
	public static boolean get(long packed, int position) {
		long check = ((packed<<(63-position))>>>63);
		return (check == 1);
		}
	
	public static long set(long packed, int position, boolean value){
		if (value){
			packed |= 1l<<position;
			}
		else{
			packed &= ~(1l<<position);
			}
		return packed;
		}
	}
			