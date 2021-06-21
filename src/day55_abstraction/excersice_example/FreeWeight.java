package day55_abstraction.excersice_example;

public class FreeWeight extends Lifting {
    @Override
    public void perform() {
        System.out.println("Lifting Free Weight dumbells");

    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 6;
    }

    @Override
    public void endLift() {
        System.out.println("Carefully re-rack dumbells");
    }
}
