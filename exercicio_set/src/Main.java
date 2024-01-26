import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Map<String,String> cookies = new TreeMap<>();
        cookies.put("Username", "Maria");
        cookies.put("Email", "maria@gmail.com");
        cookies.put("phone", "997653710");
        cookies.put("phone", "978943123");

        cookies.remove("Email");
        System.out.println("ALL COOKIES");
        for(String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }
        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone Number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Cookie size " + cookies.size());

        System.out.println("---------------------------------------");

        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("Tv", 1200.00);
        Product p2 = new Product("Notebook", 1500.00);
        Product p3 = new Product("Tablet", 900.00);



        stock.put(p1, 10000.00);
        stock.put(p2, 10000.00);
        stock.put(p3, 10000.00);


        Product ps = new Product("Tv", 1200.00);

        System.out.println("Contains 'Tablet' key: " + stock.containsKey(ps));





            }
}



