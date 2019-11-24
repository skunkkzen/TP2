public class Product {

    //Variaveis

    private String name;
    private String description;
    private String picture;
    private Category category;
    private float price;
    private char unitytype;

    //Construtores


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

    public char getUnitytype() {return unitytype;}
    public void setUnitytype(char unitytype) {this.unitytype = unitytype;}

    public String getCategoryName(){return category.getName();}

    public String getCategorycolor(){return category.getColor();}


}
