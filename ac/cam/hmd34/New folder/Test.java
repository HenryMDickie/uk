public class Test{
	public static void f(int[] b){
		b = {3};
		return;
		}
	public static void main(String[] args){
		int[] test = {3};
		f(test);
		System.out.println(test);
		}
	}