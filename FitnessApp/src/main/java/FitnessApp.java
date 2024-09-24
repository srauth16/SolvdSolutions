import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

// Main Fitness App Class
public class FitnessApp {

    public static void main(String[] args) {
        try {
            User user = new User("U001", "Alice", 20);
            System.out.println(user.getUserInfo());

            Workout cardio = new CardioWorkout("W001", 30);
            cardio.performWorkout();
            System.out.println(cardio.getWorkoutDetails());

            Workout strength = new StrengthWorkout("W002", 45);
            strength.performWorkout();
            System.out.println(strength.getWorkoutDetails());

            Device wearable = new Device("D001", "Wearable", "Fitbit");
            System.out.println(wearable.getDeviceInfo());

            StepGoal stepGoal = new StepGoal(10000);
            stepGoal.setGoal(12000);
            System.out.println("Step Goal: " + stepGoal.getGoal());

            logCalories(-500); // Example of catching NegativeCaloriesException

            tryWithResourcesExample();
        } catch (InvalidAgeException e) {
            logToConsoleAndFile("ERROR: " + e.getMessage());
        } catch (NegativeCaloriesException e) {
            logToConsoleAndFile("ERROR: " + e.getMessage());
        }
    }

    // Method to log calories
    public static void logCalories(int calories) throws NegativeCaloriesException {
        if (calories < 0) {
            throw new NegativeCaloriesException("Calories cannot be negative.");
        }
        logToConsoleAndFile("Calories logged: " + calories);
    }

    // Try-With-Resources Example
    public static void tryWithResourcesExample() {
        try (FileWriter fw = new FileWriter("workout-log.txt", true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println("Workout logged at: " + LocalDateTime.now());
            logToConsoleAndFile("Workout log updated successfully.");
        } catch (IOException e) {
            logToConsoleAndFile("ERROR: Unable to write to workout log file. " + e.getMessage());
        }
    }

    // Logging method
    public static void logToConsoleAndFile(String message) {
        System.out.println(message); // Log to console

        // Log to file
        try (FileWriter fw = new FileWriter("app-log.txt", true);
             PrintWriter pw = new PrintWriter(fw)) {
            pw.println(LocalDateTime.now() + " - " + message);
        } catch (IOException e) {
            System.err.println("ERROR: Unable to write to log file. " + e.getMessage());
        }
    }
}
