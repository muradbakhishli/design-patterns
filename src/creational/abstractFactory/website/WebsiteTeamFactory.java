package creational.abstractFactory.website;

import creational.abstractFactory.Developer;
import creational.abstractFactory.ProductOwner;
import creational.abstractFactory.ProjectTeamFactory;
import creational.abstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {


    public Developer getDeveloper(){
        return new PythonDeveloper();
    }

    public ProductOwner getProductOwner(){
        return new WebsitePo();
    }

    public Tester getTester(){
        return new ManualTester();
    }
}
