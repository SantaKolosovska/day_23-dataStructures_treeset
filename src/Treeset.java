import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {

        TreeSet<Integer> myTreeSet = new TreeSet<>();

        myTreeSet.add(-2000);
        myTreeSet.add(18);
        myTreeSet.add(59);
        myTreeSet.add(1);
        myTreeSet.add(1994);
        myTreeSet.add(18);

        // Print whole TreeSet
        System.out.println(myTreeSet);

        // get the first element
        System.out.println("First: " + myTreeSet.first());
        System.out.println("Last: " + myTreeSet.last());

        // remove an element
        myTreeSet.remove(59);
        System.out.println("TreeSet after removing element: " + myTreeSet);


        // String TreeSet
        TreeSet<String> myStringTreeSet = new TreeSet<>();

        myStringTreeSet.add("Oxana");
        myStringTreeSet.add("Cake");
        myStringTreeSet.add("Artjoms");
        myStringTreeSet.add("Martins");
        myStringTreeSet.add("Cat");
        myStringTreeSet.add("Dog");

        // Print whole TreeSet
        System.out.println(myStringTreeSet);

    }
}
