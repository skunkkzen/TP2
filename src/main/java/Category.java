public class Category {

    //variaveis

    private String name;
    private String description;
    private String color;

    //Construtores

    public Category(){}
    public Category(String name,String description,String color){
        this.name=name;
        this.description=description;
        this.color=color;
    }

    //metodos

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}
}
