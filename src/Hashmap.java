import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {

        HashMap<String, Integer> productPrices = new HashMap<>();

        productPrices.put("Apples", 1);
        productPrices.put("Milk", 2);
        productPrices.put("Cheese", 6);
        productPrices.put("Computer", 900);
        productPrices.put("Couch", 500);
        productPrices.put("Chocolate", 1);
        productPrices.put("Mobile phone", 400);
        productPrices.put("Sour cream", 1);


        // price below or equal to 1 Eur
        int counter = 0;
        for (Integer price : productPrices.values()) {
            if (price <= 1) {
                counter++;
            }
        }
        System.out.println();
        System.out.println("There are " + counter + " products with price below 1 Euro");


        // finding the product with the highest price
        System.out.println();
        int priceMax = 0;
        for (Integer price : productPrices.values()) {
            if (price > priceMax) {
                priceMax = price;
            }
        }

        for (String productName : productPrices.keySet()) {
            if (productPrices.get(productName)==priceMax){
                System.out.println(productName + " has the highest price");
            }
        }

        // better solution (Artjoms)
        int maxValue = 0;
        String maxProductName = "";
        for (String productName : productPrices.keySet() ) {
            if( productPrices.get(productName) > maxValue ) {
                maxValue = productPrices.get(productName);
                maxProductName = productName;
            }
        }

        System.out.println("max price product: " + maxProductName + " costs " + maxValue + "EUR");


        // finding the product with the lowest price
        System.out.println();
        int priceMin = priceMax;
        for (Integer price : productPrices.values()) {
            if (price < priceMin) {
                priceMin = price;
            }
        }

        for (String productName : productPrices.keySet()) {
            if (productPrices.get(productName)==priceMin){
                System.out.println(productName + " has the lowest price");
            }
        }


        // new hashmap
        HashMap<String, Integer> newProductPrices = new HashMap<>();

        newProductPrices.put("Cake", 10);
        newProductPrices.put("Headphones", 20);
        newProductPrices.put("Shampoo", 3);
        newProductPrices.put("Jeans", 18);
        newProductPrices.put("Hot Wheels car", 2);
        newProductPrices.put("A book", 5);


        // merging HashMaps and printing out how many products are in the merged HashMap
        newProductPrices.putAll(productPrices);

        counter = 0;
        for (String prodName : newProductPrices.keySet()) {
            counter++;
        }
        System.out.println();
        System.out.println("There are " + counter + " products in the merged HashMap");


        // Sort all values in ascending order
        ArrayList<Integer> productPricesAsc = new ArrayList<>();    // creating an arraylist for product prices

        for (int price : newProductPrices.values()) {               // filling the arraylist with product prices
            productPricesAsc.add(price);                            // from the hashmap
        }
        Collections.sort(productPricesAsc);                         // sorting the arraylist

        System.out.println();
        System.out.println("Prices in ascending order: ");

        for (int price : productPricesAsc) {                        // looping through the arraylist and hashmap to
            for (String prodName : newProductPrices.keySet()) {     // get the corresponding names for the sorted prices
                if ( price == newProductPrices.get(prodName)){
                    System.out.println(prodName + " - " + price);
                }
            }
        }



        // arraylist vs hashmap
//        ArrayList<String> materialArrayList = new ArrayList<>();
//        materialArrayList.add("Metal");
//        materialArrayList.add("Plastic");
//        materialArrayList.add("Wood");
//        materialArrayList.add("Glass");
//
//        System.out.println(materialArrayList.get(1));
//
//        HashMap<String, Integer> productHashMap = new HashMap<>();
//        productHashMap.put("Cake", 6);
//        productHashMap.put("Bread", 1);
//        productHashMap.put("Oranges", 3);
//        productHashMap.put("Jam", 4);
//
//        System.out.println(productHashMap.get("Cake"));



    // last
    }
}
