public static String padString(String a, int b) {
    int c = a.length();
    if(b >= c){
        for(int i = 1; i <= b - c; i++) {
            a = " " + a;
        }
        return a;
    }
    return a;
}