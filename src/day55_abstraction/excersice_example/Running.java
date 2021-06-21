package day55_abstraction.excersice_example;

public class Running extends Exercise{

    @Override
    public void perform() {
        System.out.println("Performing running exercise");
    }
    /**
     *
     * @param minutes - how long is exercise is performed
     * @return we are assuming avg num of calories while running is 13
     */

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 13;
    }
}
