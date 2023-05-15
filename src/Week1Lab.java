import java.util.Scanner;

public class Week1Lab {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter name or X to quit: ");
            String name = sc.nextLine();
            if (name.equals("X")) {
                break;
            }

            System.out.print("Your age: ");
            int age = sc.nextInt();

            System.out.print("Your weight: ");
            double weight = sc.nextDouble();

            System.out.print("Your height - feet: ");
            int feet = sc.nextInt();

            System.out.print("Your height - inches: ");
            int inches = sc.nextInt();

            HealthProfile healthProfile = new HealthProfile(name, age, weight, feet * 12.0 + inches);
            System.out.println();

            System.out.println("Health profile for " + healthProfile.getName());
            System.out.println("BMI: " + healthProfile.getBMI());
            System.out.println("BMI Category: " + healthProfile.getCategory());
            System.out.println("Max heart rate: " + healthProfile.getMaxHR());
            System.out.println();
        }
    }
}
