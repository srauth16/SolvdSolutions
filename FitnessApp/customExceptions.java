// Custom Exceptions
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class NegativeCaloriesException extends Exception {
    public NegativeCaloriesException(String message) {
        super(message);
    }
}

class WorkoutNotFoundException extends Exception {
    public WorkoutNotFoundException(String message) {
        super(message);
    }
}

class FitnessGoalNotSetException extends Exception {
    public FitnessGoalNotSetException(String message) {
        super(message);
    }
}

class DailyStepGoalNotReachedException extends Exception {
    public DailyStepGoalNotReachedException(String message) {
        super(message);
    }
}
