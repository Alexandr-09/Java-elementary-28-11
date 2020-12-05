public class ClassTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat catNull = null;
        Cat anotherCAt = cat;
        Cat cat3 = new Cat();
        Cat cat4 = anotherCAt;


        System.out.println(catNull);
        System.out.println(cat.toString());
        System.out.println(cat);
        System.out.println("Another cat : " + anotherCAt);
        System.out.println("Another cat3 : " + cat3);
        System.out.println("Another cat4 : " + cat4);


        cat = null;

    }
}
