import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> Countries = new LinkedList<String>();
        Countries.add("England");
        Countries.add("Poland");
        Countries.add("Russia");
        Countries.add("France");
        // It behaves similarly / identically to an Array
        // However, it stores the data in a different way
        // It's called a linked list because the components are stored in containers and
        // each container is linked
        // Linked Lists are a good way of manipulating data

        // They also have special methods
        System.out.println(Countries.getFirst()); // prints England
        System.out.println(Countries.getLast()); // prints France

        // the same exists in the remove and add forms

    }
}