public static void inputBirthday(Scanner input){
    System.out.print("On what day of the month were you born? ");
    int a = input.nextInt();

    System.out.print("What is the name of the month in which you were born? ");
    String b = input.next();

    System.out.print("During what year were you born? ");
    int c = input.nextInt();

    System.out.print("You were born on " + b + " " + a + ", " + c + ". You're mighty old!");
}