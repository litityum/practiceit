public class CollegeAdmit{
public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    System.out.println("University admission program");
    System.out.print("What is your GPA? ");
    double GPA = input.nextDouble();
    System.out.print("What is your SAT score? ");
    int SAT = input.nextInt();
    if(GPA < 1.8){
        System.out.print("Your GPA is too low.");
    }
    else if (SAT < 900){
        System.out.print("Your SAT score is too low.");
    }
    else{
        System.out.print("You were accepted!");
    }
}
}