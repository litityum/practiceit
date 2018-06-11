public static void smallestLargest(){
    Scanner console = new Scanner(System.in);
    System.out.print("How many numbers do you want to enter? ");
    int numbers = console.nextInt();
    System.out.print("Number 1: ");
    int smallest = console.nextInt();
    int largest = smallest;
    for(int i = 1; i <= numbers - 1; i++){
        System.out.print("Number " + (i + 1) + ": ");
        int number = console.nextInt();
        if(number <= smallest)
            smallest = number;
        if(number >= largest)
            largest = number;
    }
    System.out.println("Smallest = " + smallest);
    System.out.print("Largest = " + largest);
}