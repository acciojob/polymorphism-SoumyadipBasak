class Main{

    public class Product {
        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();

        int productInt = p.product(10, 20);
        System.out.println("Product of two integers: " + productInt);

        int productIntThree = p.product(10, 20, 30);
        System.out.println("Product of three integers: " + productIntThree);
        
        double productDouble = p.product(10.5, 20.2);
        System.out.println("Product of two doubles: " + productDouble);
    }
}

