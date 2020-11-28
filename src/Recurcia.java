public class Recurcia {
    public static void main(String[] args) {
        recursionFunc(0);

        }


        public static void  recursionFunc(int number ){
            System.out.println("number" + number);
            System.out.println("Привет, Java");

            if (number <  100){
                recursionFunc(number + 1);
            }




    }
}
