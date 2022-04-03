
import java.util.ArrayList;

public class Catrunner {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<Cat>();
        Cat cat1 = new Cat("Joey");
        Cat cat2 = new Cat("Max");
        Cat cat3 = new Cat("Jenny");
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        System.out.println(cats);

        // WRITE MORE CODE HERE

        Cat cat4 = new Cat("toby");
        Cat replacedCat = cats.set(2,cat4);
        System.out.pritln(cats);
        System.out.println(replacedCat);

        Cat catAtIndex1 = cats.get(1);
        catAtIndex1.setName(catAtinIndex1. getName() + "Meow";
        System.out.println(cats);

        cats.add(new cat("SAME") ));
        system.out.println(cats);

    }
}

