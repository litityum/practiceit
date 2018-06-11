public static void printReverse(String a) {
    int b = a.length();
    for(int i = b - 1; i >= 0; i--) {
        System.out.print(a.substring(i, i + 1));
    }
}