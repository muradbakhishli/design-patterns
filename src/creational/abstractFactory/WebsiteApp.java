package creational.abstractFactory;

import creational.abstractFactory.website.WebsiteTeamFactory;

public class WebsiteApp {
    public static void main(String[] args) {
        var website = new WebsiteTeamFactory();
        var websitePo = website.getProductOwner();
        var websiteDeveloper = website.getDeveloper();
        var websiteTester = website.getTester();

        System.out.println("Website application is running");
        websiteDeveloper.writeCode();
        websitePo.manageProduct();
        websiteTester.testCode();
    }
}
