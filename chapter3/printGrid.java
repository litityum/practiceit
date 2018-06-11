public static void printGrid(int rows, int cols){
    for(int i = 1; i <= rows; i++){
        for(int j = i; j <= rows * (cols - 1); j += rows){
            System.out.print(j + ", ");
        }
        System.out.println(rows * (cols - 1) + i);
    }
}