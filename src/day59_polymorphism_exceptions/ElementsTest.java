package day59_polymorphism_exceptions;

public class ElementsTest {
    public static void main(String[] args) {
        Link link = new Link();
        link.click();
        link.getText();
        link.sendKeys("hi");
        link.getlinkHref();

        WebElement loginLink = new Link();
        loginLink.click();
        String txt = loginLink.getText();
        System.out.println("txt = " + txt);
        loginLink.sendKeys("ho");

        WebElement username = new InputField();
        username.sendKeys("wooden spoon");
        username.click();

        WebElementUtil.clickElement(loginLink);
        WebElementUtil.clickElement(username);

        WebElement login = WebElementUtil.getLinkWithText("login");
        login.click();

    }
}
