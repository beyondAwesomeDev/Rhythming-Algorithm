package jeonghyun.week13;

public class hk_SherlockandSquares {
	
	static int squares(int a, int b) {

		int a_sqrt = (int)Math.ceil(Math.sqrt((double)a));
		int b_sqrt = (int)Math.floor(Math.sqrt((double)b));
	
		
		return (b_sqrt - a_sqrt) + 1;
		
		
    }


	public static void main(String[] args) {

	}

}
