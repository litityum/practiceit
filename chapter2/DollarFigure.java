public class DollarFigure{
    public static final int SIZE = 7;
    public static void main(String [] args){
        for(int i = 1; i <= SIZE; i++){
            for(int j = 1; j <= 2 * i - 2; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= SIZE + 1 - i; j++){
                System.out.print("$");
            }
            for(int j = SIZE; j >= i; j--){
                System.out.print("*");
            }
            for(int j = SIZE; j >= i; j--){
                System.out.print("*");
            }
            for(int j = 1; j <= SIZE + 1 - i; j++){
                System.out.print("$");
            }
            for(int j = 1; j <= 2 * i - 2; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}