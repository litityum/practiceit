public class StarFigure2{
    public static final int SIZE = 6;
	public static void main(String []args) {
		for( int i = 1; i <= SIZE; i++){
		    for(int j = 1; j <= 4 * SIZE - 4 * i; j++){
		        System.out.print("/");
		    }
		    for(int j = 1; j <= 8 * i - 8; j++){
		        System.out.print("*");
		    }
		    for(int j = 1; j <= 4 * SIZE - 4 * i; j++){
		        System.out.print("\\");
		    }
		    System.out.println();
		}
	}
}