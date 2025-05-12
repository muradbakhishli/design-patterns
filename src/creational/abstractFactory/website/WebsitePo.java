package creational.abstractFactory.website;

import creational.abstractFactory.ProductOwner;

public class WebsitePo implements ProductOwner {

    public void manageProduct(){
        System.out.println("Website PO manage product");
    }
}
