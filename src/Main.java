import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String option;
        while (true)
        {
            System.out.println("0:Sh20 (30mins, 3hrs)");
            System.out.println("1:Sh50 (40Mins+50SMS, 24hrs)");
            System.out.println("2:Okoa Easy Sh100(100 Mins, 2days)");
            System.out.println("3:Okoa 250");
            System.out.println("4:Okoa 100");
            System.out.println("5:Okoa 50");
            System.out.println("6:Okoa 20");
            System.out.println("7:Okoa 10");
            System.out.println("8:Okoa 5");
            System.out.println("98:More");
            option = input.nextLine();

            if (option.equals("0"))
            {
                do {
                    System.out.println("Existing Unpaid Okoa: 0");
                    System.out.println("New Okoa request: 20");
                    System.out.println("TOTAL DEBT will be: 20");
                    System.out.println("1:Accept");
                    System.out.println("2:Decline");
                    System.out.println("0:BACK 00:HOME");
                    option = input.nextLine();
                }
                while (! option.equals("0"));
            }
        }
    }
}