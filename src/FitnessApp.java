public class FitnessApp {
    public static void main(String[] args) {

        User user = new User("U001", "Alice");
        CardioWorkout cardio = new CardioWorkout("W001", 30);
        StrengthWorkout strength = new StrengthWorkout("W002", 5);
        WearableDevice wearable = new WearableDevice("D001", "Fitbit", "Charge 4");
        Smartphone smartphone = new Smartphone("D002", "Apple", "iOS");

        System.out.println(user);
        System.out.println(cardio);
        System.out.println(strength);
        System.out.println(wearable);
        System.out.println(smartphone);
    }
}
class FitnessEntity {
    private String id;

    public FitnessEntity(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }


    public String toString() {
        return "FitnessEntity{id='" + id + "'}";
    }


    public int hashCode() {
        return id.hashCode();
    }


    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        FitnessEntity that = (FitnessEntity) obj;
        return id.equals(that.id);
    }
}


class User extends FitnessEntity {
    private String name;

    public User(String id, String name) {
        super(id);
        this.name = name;
    }


    public String toString() {
        return "User{id='" + getId() + "', name='" + name + "'}";
    }
}


class Workout extends FitnessEntity {
    private String type;

    public Workout(String id, String type) {
        super(id);
        this.type = type;
    }


    public String toString() {
        return "Workout{id='" + getId() + "', type='" + type + "'}";
    }
}


class CardioWorkout extends Workout {
    private int duration; // in minutes

    public CardioWorkout(String id, int duration) {
        super(id, "Cardio");
        this.duration = duration;
    }


    public String toString() {
        return "CardioWorkout{id='" + getId() + "', duration=" + duration + " mins}";
    }
}


class StrengthWorkout extends Workout {
    private int sets;

    public StrengthWorkout(String id, int sets) {
        super(id, "Strength");
        this.sets = sets;
    }


    public String toString() {
        return "StrengthWorkout{id='" + getId() + "', sets=" + sets + "}";
    }
}


class Device extends FitnessEntity {
    protected String brand;  // Changed to protected to allow access in subclasses

    public Device(String id, String brand) {
        super(id);
        this.brand = brand;
    }


    public String toString() {
        return "Device{id='" + getId() + "', brand='" + brand + "'}";
    }
}


class WearableDevice extends Device {
    private String model;

    public WearableDevice(String id, String brand, String model) {
        super(id, brand);
        this.model = model;
    }


    public String toString() {
        return "WearableDevice{id='" + getId() + "', brand='" + brand + "', model='" + model + "'}";
    }
}


class Smartphone extends Device {
    private String os;

    public Smartphone(String id, String brand, String os) {
        super(id, brand);
        this.os = os;
    }


    public String toString() {
        return "Smartphone{id='" + getId() + "', brand='" + brand + "', os='" + os + "'}";
    }
}


class ActivityLog extends FitnessEntity {
    private String activityType;

    public ActivityLog(String id, String activityType) {
        super(id);
        this.activityType = activityType;
    }


    public String toString() {
        return "ActivityLog{id='" + getId() + "', activityType='" + activityType + "'}";
    }
}


class Goal extends FitnessEntity {
    private String goalType;

    public Goal(String id, String goalType) {
        super(id);
        this.goalType = goalType;
    }


    public String toString() {
        return "Goal{id='" + getId() + "', goalType='" + goalType + "'}";
    }
}


class WeightGoal extends Goal {
    private double targetWeight;

    public WeightGoal(String id, double targetWeight) {
        super(id, "Weight");
        this.targetWeight = targetWeight;
    }


    public String toString() {
        return "WeightGoal{id='" + getId() + "', targetWeight=" + targetWeight + " kg}";
    }
}


class StepGoal extends Goal {
    private int stepCount;

    public StepGoal(String id, int stepCount) {
        super(id, "Steps");
        this.stepCount = stepCount;
    }


    public String toString() {
        return "StepGoal{id='" + getId() + "', stepCount=" + stepCount + " steps}";
    }
}
