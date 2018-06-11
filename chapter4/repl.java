public static String repl(String a, int n){
    String empty = "";
    if(n <= 0)
        return empty;
    String b = a;
    for(int i = 2; i <= n; i++)
        b += a;
    return b;
}