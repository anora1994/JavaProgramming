package day49_static;

public class StaticVariablesTest {
    public static void main(String[] args) {
        System.out.println(StatcVariables.name);
        System.out.println(StatcVariables.username);
        System.out.println(StatcVariables.age);
        System.out.println(StatcVariables.price);
        System.out.println("driver.findElement(By.xpath("+Locators.userName+").sendKeys("+StatcVariables.username+")");
        System.out.println(Locators.password);
        System.out.println(Integer.MAX_VALUE);

    }
}
