public static void xo(int N){
    if (N <= 0)        
        return;
    
    for(int i = 1; i <= N; i++){
        for(int j = 1; j <= N; j++){
            if(j == i || j == N + 1 - i){
                System.out.print("x");
            }
            else 
                System.out.print("o");
            
        }
        System.out.println();
    }
}