package day52_inheritance;

public class AppObjects {
    public static void main(String[] args) {
        MobileApp mobileApp = new MobileApp();
        mobileApp.name= "YouTube";
        mobileApp.useTheApp(10);
        mobileApp.download();

        Instagram instagram = new Instagram();
        instagram.name = "instagram";
        instagram.useTheApp(20);
        instagram.download();

        Discord discord = new Discord();
        discord.name = "discord";
        discord.useTheApp(10);
        discord.download();

        Discord b22Discord = new Discord();
        b22Discord.name = "Discord";
        b22Discord.useTheApp(100);

    }
}
