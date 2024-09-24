// Cardio Workout Class
class CardioWorkout extends Workout {

    public CardioWorkout(String workoutId, int duration) {
        super(workoutId, duration);
    }

    @Override
    public void performWorkout() {
        System.out.println("Performing cardio workout for " + duration + " minutes.");
    }
}
