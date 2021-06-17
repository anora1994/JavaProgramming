package day52_inheritance;

public class Discord extends MobileApp{
    public void chat(String someone){
        System.out.println("Chatting with " + someone);
    }
    @Override
    public boolean download(){
        System.out.println("Downloaded Discord");
        return true;
    }

    @Override
    public void useTheApp(int minutes){
        super.useTheApp(minutes);
        chat("Vladislav");
    }
}
