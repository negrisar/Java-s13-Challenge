package employeeApp.model;

public enum Plan {

    ECO("ECO", 1000),
    NORMAL("NORMAL", 1750),
    PRO("PRO", 2500);

    private String name;
    private int price;

    Plan(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }


}
