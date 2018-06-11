public static void longestName(Scanner console, int names) {
	int longest = 0;
    int tie = 0;
    String longer = " ";
    for(int i = 1; i <= names; i++){
        System.out.print("name #" + i + "? ");
        String name = console.next();
        int length = name.length();
        if(length == longest)
            tie++;
        if( length > longest){
            longest = length;
            longer = name;
            tie = 0;
        }
        
    }
    longer = longer.toLowerCase();
    String baskarakter = longer.substring(0, 1).toUpperCase();
    longer = baskarakter + longer.substring(1);
    System.out.println(longer + "'s name is longest");
    if(tie >= 1)
        System.out.println("(There was a tie!)");
}