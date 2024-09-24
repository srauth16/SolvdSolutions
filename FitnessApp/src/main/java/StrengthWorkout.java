// Strength Workout Class
class StrengthWorkout extends Workout {

    public StrengthWorkout(String workoutId, int duration) {
        super(workoutId, duration);
    }

    @Override
    public void performWorkout() {
        System.out.println("Performing strength workout for " + duration + " minutes.");
    }
}
