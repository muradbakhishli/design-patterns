package creational.abstractFactory;

public interface ProjectTeamFactory {

    Developer getDeveloper();

    ProductOwner getProductOwner();

    Tester getTester();


}
