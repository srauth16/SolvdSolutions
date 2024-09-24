// Abstract Workout Class
abstract class Workout {
    protected String workoutId;
    protected int duration; // in minutes

    public Workout(String workoutId, int duration) {
        this.workoutId = workoutId;
        this.duration = duration;
    }

    public abstract void performWorkout();

    public String getWorkoutDetails() {
        return "Workout[ID=" + workoutId + ", Duration=" + duration + " minutes]";
    }
}
