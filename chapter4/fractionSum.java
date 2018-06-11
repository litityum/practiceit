public static double fractionSum(int n){
    double z = 0;
    for(int i = 1; i <= n; i++){
        z += 1.0/i;
    }
    return z;
}