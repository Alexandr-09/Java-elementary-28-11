public class PrimitiveTest {
    public static void main(String[] args) {
        int age = 15 ;
        System.out.println("   age before : " + age);
        System.out.println( " age after  main" + age );
        changeAge(age);
    }
    public static void changeAge(int age){
        System.out.println(" Are before change in method changeAge : "+ age);
        age += 100;
        System.out.println(" Are after change  in method chandeAge :  " + age);
    }
}
