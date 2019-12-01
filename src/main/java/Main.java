import java.util.*;
import java.text.DecimalFormat;
public class Main {

    private static DecimalFormat df2 = new DecimalFormat("#.##");
    public static void main(String[] args) {

        ArrayList<User> users = CreateUsers();
        ArrayList<Category> categories = CreateCategories();
        ArrayList<Product> products = CreateProducts(categories);

        ShoppingList list = new ShoppingList(
                "ShoppingList_User1",
                users.get(0),
                Arrays.asList(users.get(1), users.get(2)),
                Arrays.asList(products.get(0), products.get(1), products.get(2), products.get(3), products.get(4)),
                Arrays.asList(products.get(5), products.get(6)));

        // nome das pessoas com quem a lista está a ser partilhada
        System.out.println("Nome das pessoas com quem a lista esta a ser partilhada:");
        for (User user : list.getUserList())
            System.out.println(String.format("\t - %s", user.getname()));
        System.out.println();

        // nº de productos + total do preço dos productos que se encontram no carrinho
        System.out.println("N de productos + total do preco dos productos que se encontram no carrinho: N = " + list.getTotalOfProductsOnShoppingCart() + " Total = " + list.getTotalPriceOnCart());
        System.out.println();

        // nº de productos + total de preço dos productos que se encontram no carrinho
        System.out.println("N de productos + total de preco dos productos que nao se encontram no carrinho: N = " + list.getTotalOfProducts() + " Total = " + list.getTotalPrice());
        System.out.println();

        // Percentagem complete
        System.out.println("Percentagem complete: " + df2.format(list.GetPercentageCompleted()) + "%");
        System.out.println();




        // Imprimir as categorias que existem no carrinho e por categoria imprimir o nome dos produtos

        Map<String, ArrayList<Product>> map = new HashMap<String, ArrayList<Product>>();

        for (Product p : list.getProductList1())
        {
            if (map.containsKey(p.getCategoryName()))
            {
                map.get(p.getCategoryName()).add(p);
            }
            else
            {
                map.put(p.getCategoryName(), new ArrayList<Product>(Arrays.asList(p)));
            }
        }

        for (Product p : list.getProductList2())
        {
            if (map.containsKey(p.getCategoryName()))
            {
                map.get(p.getCategoryName()).add(p);
            }
            else
            {
                map.put(p.getCategoryName(), new ArrayList<Product>(Arrays.asList(p)));
            }
        }

        for (String categoryName: map.keySet())
        {
            List<Product> prods = map.get(categoryName);

            System.out.println("Categoria " + categoryName);

            for(Product product : prods)
            {
                System.out.println("\t "  + product.getName() + "\n" + product.getDescription() +  "(" + product.getUnitType() + ")" + " (Euro " + product.getPrice()  + ")");
            }
        }
    }

    private static ArrayList<Category> CreateCategories() {

        Category cat1 = new Category("1", "category one", "blue");
        Category cat2 = new Category("2", "category two", "red");
        Category cat3 = new Category("3", "category three", "green");

        ArrayList<Category> categories = new ArrayList<Category>(Arrays.asList(cat1, cat2, cat3));
        return categories;
    }

    private static ArrayList<Product> CreateProducts(ArrayList<Category> categories) {

        Product p1 = new Product("Producto_1", "product one", "picture1", categories.get(0), 100, UnitType.UN);
        Product p2 = new Product("Producto_2", "product two", "picture2", categories.get(1), 200, UnitType.KG);
        Product p3 = new Product("Producto_3", "product three", "picture3", categories.get(2), 300, UnitType.KG);
        Product p4 = new Product("Producto_4", "product four", "picture4", categories.get(0), 400, UnitType.UN);
        Product p5 = new Product("Producto_5", "product five", "picture5", categories.get(1), 500, UnitType.KG);
        Product p6 = new Product("Producto_6", "product six", "picture6", categories.get(2), 600, UnitType.KG);
        Product p7 = new Product("Producto_7", "product seven", "picture7", categories.get(0), 700, UnitType.UN);

        ArrayList<Product> products = new ArrayList<Product>(Arrays.asList(p1, p2, p3, p4, p5, p6, p7));
        return products;
    }

    public static ArrayList<User> CreateUsers() {
        User user1 = new User("Utilizador_1", "user1@email.com", "password1", "user1");
        User user2 = new User("Utilizador_2", "user2@email.com", "password2", "user2");
        User user3 = new User("Utilizador_3", "user3@email.com", "password3", "user3");

        ArrayList<User> users = new ArrayList<User>(Arrays.asList(user1, user2, user3));
        return users;
    }
}
