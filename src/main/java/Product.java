public class Product {

    // Variaveis

    private String name;
    private String description;
    private String picture;
    private Category category;
    private float price;
    private UnitType unitType;

    //Construtores

    public Product(String name, String description, String picture, Category category, float price, UnitType unitType) {
        this.name = name;
        this.description = description;
        this.picture = picture;
        this.category = category;
        this.price = price;
        this.unitType = unitType;
    }

    //Métodos

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}

    public String getPicture() {return picture;}
    public void setPicture(String picture) {this.picture = picture;}

    public Category getCategory() {return category;}
    public void setCategory(Category category) {this.category = category;}

    public float getPrice() {return price;}
    public void setPrice(float price) {this.price = price;}

    public UnitType getUnitType() {return unitType;}
    public void setUnitType(UnitType unitType) {this.unitType = unitType;}

    public String getCategoryName() {return category.getName();}
    public String getCategoryColor() {return category.getColor();}
}
