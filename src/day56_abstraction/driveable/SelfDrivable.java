package day56_abstraction.driveable;

public interface SelfDrivable {
void autoPiloting();
//void selfPark();
    public default void SelfPark(){ //if we add default method it will prevent errors
        System.out.println("performing self park steps");
    }
}
