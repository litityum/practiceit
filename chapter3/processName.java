public static void processName(Scanner console){
    System.out.print("Please enter your full name: ");
    String first = console.next();
    String last = console.next();
    System.out.print("Your name in reverse order is " + last + ", " + first);
}