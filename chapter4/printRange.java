public static void printRange(int m, int n){
    if(m >= n){
        for(int i = m; i >= n; i--){
            System.out.print(i + " ");
        }
    }
    else{
        for(int i = m; i <= n; i++){
            System.out.print(i + " ");
        }
    }
}