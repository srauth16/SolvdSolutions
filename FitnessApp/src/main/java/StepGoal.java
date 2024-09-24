// StepGoal Class
class StepGoal implements Goal {
    private int stepGoal;

    public StepGoal(int stepGoal) {
        this.stepGoal = stepGoal;
    }

    @Override
    public void setGoal(int stepGoal) {
        this.stepGoal = stepGoal;
    }

    @Override
    public int getGoal() {
        return stepGoal;
    }
}
