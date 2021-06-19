package potom_udalyu;

import java.util.logging.SocketHandler;

public class Sport {
    String name;
    int numofplayers;
    boolean teambased;
    public void makeSport(String nameofcport, int players, boolean teams){
        name = nameofcport;
        numofplayers = players;
        teambased = teams;
    }
    public String toString(){
        return "lalal" + name + " alal" + numofplayers + "ss" + teambased;
    }

    public static void main(String[] args) {
        Sport soccer = new Sport();
        soccer.makeSport("Soccer", 22, true);
        System.out.println(soccer);
    }
}
