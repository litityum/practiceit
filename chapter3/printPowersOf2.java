public static void printPowersOf2(int a){
    for(int i = 0; i <= a; i++){
        int x = 1;
        for(int j = 1; j <= i; j++){
            x *= 2;
        }
        System.out.print(x + " ");
    }
}