package day52_inheritance.discordusers;

public class Admin extends User{
    public Admin(){
        super();
        System.out.println("Admin class constructor");
    }
    public Admin(String name, int id){
        super("Admin", name,  id);
        System.out.println("Asmin class 2 args constructor");
    }

    @Override
    public String toString(){
        return "Admin{" +
                "role='" + getRole() + '\'' +
                ", name='" + getName() + '\'' +
                ", id=" + getId() +
                '}';
    }
}
