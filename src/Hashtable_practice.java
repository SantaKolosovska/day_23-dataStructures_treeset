import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;

public class Hashtable_practice {
    public static void main(String[] args) {

        //  8 products
        Hashtable<String, Double> prodPrices = new Hashtable<>();
        prodPrices.put("Juice", 2.0);
        prodPrices.put("Toilet paper", 2.50);
        prodPrices.put("Toothpaste", 3.0);
        prodPrices.put("Sunglasses", 4.99);
        prodPrices.put("Pop-it", 5.00);
        prodPrices.put("Pastry", 0.50);
        prodPrices.put("Coconut oil", 4.20);
        prodPrices.put("Backpack", 30.00);


        // how many products are under 1 eur
        int counter = 0;
        for (String prodName : prodPrices.keySet()) {
            if (prodPrices.get(prodName) <= 1) {
                counter++;
            }
        }
        System.out.println("There are " + counter + " product/s with price under 1 Eur");


        //which product price is the largest
        double maxPrice = 0;
        String productWithHighestPrice = null;
        for (String prodName : prodPrices.keySet()) {
            if (prodPrices.get(prodName) > maxPrice) {
                maxPrice = prodPrices.get(prodName);
                productWithHighestPrice = prodName;
            }
        }

        System.out.println(productWithHighestPrice + " is product with the highest price, and it costs " + maxPrice);


        // which product price is the lowest.
        double minPrice = maxPrice;
        String productWithLowestPrice = null;
        for (String prodName : prodPrices.keySet()) {
            if (prodPrices.get(prodName) < minPrice) {
                minPrice = prodPrices.get(prodName);
                productWithLowestPrice = prodName;
            }
        }

        System.out.println(productWithLowestPrice + " is product with the lowest price, and it costs " + minPrice);


        // new Hashtable with other products
        Hashtable<String, Double> newProdPrices = new Hashtable<>();
        newProdPrices.put("Tea", 1.69);
        newProdPrices.put("Bananas", 2.0);
        newProdPrices.put("Canned beans", 0.7);
        newProdPrices.put("Carrots", 0.5);
        newProdPrices.put("Boots", 20.0);
        newProdPrices.put("Oven", 200.0);
        newProdPrices.put("Jacket", 23.0);


        // merge hashtables and print how many products are there
        newProdPrices.putAll(prodPrices);

        counter = 0;
        for (String prodName : newProdPrices.keySet()) {
            counter++;
        }
        System.out.println();
        System.out.println("There are " + counter + " products in the merged Hashtable");

        
        // ascending order
        ArrayList<Double> prodPriceArrayList = new ArrayList<>();   // creating an arraylist for product prices

        for (String prodName : newProdPrices.keySet()) {            // filling the arraylist with product prices from
            prodPriceArrayList.add(newProdPrices.get(prodName));    // the hashtable
        }
        Collections.sort(prodPriceArrayList);                       // sorting the arraylist in ascending order

        System.out.println("Product prices in ascending order");    // looping through the arraylist and hashtable to
        for (double prodPrice : prodPriceArrayList) {               // get corresponding key for each price
            for (String prodName : newProdPrices.keySet()) {
                if (prodPrice == newProdPrices.get(prodName)){
                    System.out.println(prodName + ": " + prodPrice);
                }
            }
        }



    }
}
