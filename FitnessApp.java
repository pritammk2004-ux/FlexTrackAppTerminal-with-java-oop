import java.util.Scanner;

public class FitnessApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter Name: ");
            String name = input.nextLine();

            System.out.print("Enter Weight (kg): ");
            double weight = input.nextDouble();
            input.nextLine();

            System.out.print("Enter Goal (Weight Loss / Muscle Building / Balanced): ");
            String goal = input.nextLine();

            System.out.print("Enter Age: ");
            int age = input.nextInt();

            System.out.print("Enter Height (m): ");
            double height = input.nextDouble();
            input.nextLine();

            System.out.print("Enter Body Type (Lean / Balanced / Overweight): ");
            String bodyType = input.nextLine();

            UserProfile user = new UserProfile(
                    name,
                    weight,
                    goal,
                    age,
                    height,
                    bodyType
            );

            FitnessPlan plan = FitnessPlan.create(user);

            double bmi = weight / (height * height);

            String bmiCategory;

            if (bmi < 18.5) {
                bmiCategory = "Underweight";
            } else if (bmi < 25) {
                bmiCategory = "Normal";
            } else if (bmi < 30) {
                bmiCategory = "Overweight";
            } else {
                bmiCategory = "Obese";
            }

            int steps;

            switch (goal) {
                case "Weight Loss":
                    steps = 12000;
                    break;

                case "Muscle Building":
                    steps = 8000;
                    break;

                default:
                    steps = 10000;
            }

            System.out.println("\n===== FITNESS REPORT =====");

            System.out.println(plan.generateReport());

            System.out.println("\nBMI: " + String.format("%.2f", bmi));
            System.out.println("Category: " + bmiCategory);
            System.out.println("Steps: " + steps);
            System.out.println("Age: " + age);
            System.out.println("Body Type: " + bodyType);

        } catch (Exception e) {
            System.out.println("Please enter valid inputs.");
        }

        input.close();
    }
}