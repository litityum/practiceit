public static int daysInMonth(int n){
    if(n == 2)
        return 28;
    if(n == 4 || n == 6 || n == 9 || n == 11)
        return 30;
    return 31;
}