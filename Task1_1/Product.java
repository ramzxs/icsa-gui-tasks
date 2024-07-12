package Task1_1;

public class Product {
    private String name;
    private float price;

    // Getters and Setters

    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        if (n.equals("")) {
            System.out.println("Invalid Name");
        } else {
            this.name = n;
        }
    }

    public float getPrice() {
        return price;
    }

    // modifiers returnDataType methodName(param1DataType param1VarName, ...)
    public void setPrice(float price) {
        if (price <= 0) {
            System.out.println("Invalid Price");
        } else {
            this.price = price;
        }
    }    
}
