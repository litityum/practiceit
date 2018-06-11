public static void vertical(String a) {
    int b = a.length() - 1;
    for(int i = 0; i <= b; i++) {
        System.out.println(a.substring(i, i + 1));
    }
}