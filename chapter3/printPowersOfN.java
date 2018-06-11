public static void printPowersOfN(int N , int a){
    for(int i = 0; i <= a; i++){
        int x = 1;
        for(int j = 1; j <= i; j++){
            x *= N;
        }
        System.out.print(x + " ");
    }
}