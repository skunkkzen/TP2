import java.util.ArrayList;
import java.util.List;

import javax.jws.soap.SOAPBinding;

public class ShoppingList {

    private String listName;
    private User user;
    private List<User> userList;
    private List<Product> productList1;
    private List<Product> productList2;


    public ShoppingList
            (String ListName, User user, List<User> userList) {

        this.listName = ListName;
        this.user = user;
        this.userList = userList;
        this.productList1 = new ArrayList<Product>();
        this.productList2 = new ArrayList<Product>();
    }



    public ShoppingList(String listName, User user, List<User> userList, List<Product> productList1, List<Product> productList2) {
        this.listName = listName;
        this.user = user;
        this.userList = userList;
        this.productList1 = productList1;
        this.productList2 = productList2;

        if (productList1 == null)
            this.productList1 = new ArrayList<Product>();

        if (productList2 == null)
            this.productList2 = new ArrayList<Product>();
    }


    public String getName() {
        return listName;
    }

    public void setName(String name) {
        this.listName = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Product> getProductList1() {
        return productList1;
    }

    public void setProductList1(List<Product> productList1) {
        this.productList1 = productList1;
    }

    public List<Product> getProductList2() {
        return productList2;
    }

    public void setProductList2(List<Product> productList2) {
        this.productList2 = productList2;
    }


    public float GetPercentageCompleted() {
        float availableProducts = this.productList1.size();
        float shoppingBagProducts = this.productList2.size();
        float totalProducts = availableProducts + shoppingBagProducts;

        float percentage = (shoppingBagProducts / totalProducts) * 100;
        return percentage;
    }




    public int getTotalOfProducts() {
        return this.productList1.size();
    }


    public int getTotalOfProductsOnShoppingCart() {
        return this.productList2.size();
    }

    public float getTotalPrice() {
        float total = 0;
        for (Product p : this.productList1) {
            total += p.getPrice();
        }

        return total;
    }

    public float getTotalPriceOnCart() {
        float total = 0;

        for (Product p : this.productList2) {
            total += p.getPrice();
        }

        return total;
    }

    public boolean addProduct(Product p) {
        return this.productList1.add(p);
    }

    public boolean removeProduct(Product p) {
        if (this.productList1.contains(p))
        {
            return this.productList1.remove(p);
        }
        return false;
    }

    public boolean addProductToShoppingCart(Product p) {

        if (this.productList1.contains(p))
        {
            this.removeProduct(p);
            this.productList2.add(p);
            return true;
        }

        return false;
    }

    public boolean removeProductToShoppingCart(Product p) {
        if (this.productList2.contains(p))
        {
            this.productList2.remove(p);
            this.addProduct(p);
            return true;
        }

        return false;
    }
}

