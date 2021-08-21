//import java.util.HashMap;
//import java.util.TreeSet;
//
//public class Artjoms_Practice {
//
//
//        public static void main(String[] args) {
//
//            TreeSet<Integer> myTreeSet = new TreeSet<>();
//
//            myTreeSet.add(-2000);
//            myTreeSet.add(18);
//            myTreeSet.add(59);
//            myTreeSet.add(1);
//            myTreeSet.add(1994);
//            myTreeSet.add(18);
//
//            // Print Whole TreeSet
//            System.out.println(myTreeSet);
//
//            // Get THE FIRST ELEMENT
//            System.out.println("First: " + myTreeSet.first());
//            System.out.println("Last one: " + myTreeSet.last());
//
//            myTreeSet.remove(59);
//            // Print Whole TreeSet
//            System.out.println(myTreeSet);
//
//            TreeSet<String> myStringTreeSet = new TreeSet<>();
//
//            myStringTreeSet.add("Oxana");
//            myStringTreeSet.add("Cake");
//            myStringTreeSet.add("Artjoms");
//            myStringTreeSet.add("Martins");
//            myStringTreeSet.add("Cat");
//            myStringTreeSet.add("Dog");
//
//            System.out.println(myStringTreeSet);
//
//
//            // TASK WITH THE HASHMAPS
//            HashMap<String, Integer> productPrices = new HashMap<>();
//
//            productPrices.put("Apple", 1);
//            productPrices.put("Milk", 2);
//            productPrices.put("Cheese", 6);
//            productPrices.put("Computer", 900);
//            productPrices.put("Couch", 500);
//            productPrices.put("Chocolate", 1);
//            productPrices.put("mobile phone", 400);
//            productPrices.put("Sourcream", 1);
//
//            productPrices.get("Sourcream"); //1
//
//
//            int counterPricesBelow1 = 0;
//            for ( Integer price: productPrices.values() ) {
//                if ( price <= 1 ) {
//                    counterPricesBelow1++;
//                }
//            }
//
//            int maxValue = 0;
//            String maxProdcutName = "";
//            for (String productName : productPrices.keySet() ) {
//                if( productPrices.get(productName) > maxValue ) {
//                    maxValue = productPrices.get(productName);
//                    maxProdcutName = productName;
//                }
//            }
//
//            System.out.println("max price product: " + maxProdcutName + " costs " + maxValue + "EUR");
//
//            System.out.println("There are " + counterPricesBelow1 + " below 1 eur");
//        }
//    }
//}
