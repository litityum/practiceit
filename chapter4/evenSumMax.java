public static void evenSum(){
    Scanner sc = new Scanner(System.in);
    System.out.print("how many integers? ");
    int many = sc.nextInt();
    int sum = 0;
    int max = 0;
    for(int i = 1; i <= many; i++){
        System.out.print("next integer? ");
        int number = sc.nextInt();
        if(number % 2 == 0){
            sum += number;
            if(number > max)
                max = number;
        }
    }
    System.out.println("even sum = " + sum);
    System.out.print("even max = " + max);
}