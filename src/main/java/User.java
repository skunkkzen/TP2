public class User {


    // Variaveis

    private String name;
    private String email;
    private String password;
    private String username;
    private Address address;



    //Construtores



    public User(String name, String email, String password, String username){
        this.name = name;
        this.email = email;
        this.password = password;
        this.username = username;
    }



    //Métodos


    public String getname () {return name;}
    public String getEmail () {return email;}
    public String getPassword () {return password;}
    public String getUsername () {return username;}


    public void setUsername (String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStreetName () {return  address.getStreetName();}
}
