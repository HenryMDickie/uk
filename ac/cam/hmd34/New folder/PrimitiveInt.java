public class PrimitiveInt {
	public static void main(String[] args) {
		int i;
		i = 1;
		i = i +1;
		System.out.println(i);
		System.out.println(i = 3);
		int j = 10;
		System.out.println(j--);
		System.out.println(j);
		j=10;
		System.out.println(--j);
		System.out.println(j);
		for(i=0; i<10;i++){
			if ((0x55>>i)==5){
				System.out.println("x = " + i);
				}
			if ((0x55<<i)==10880){
				System.out.println("y = " + i);
				}
			}
		System.out.println(1<<2);
		}
	}
