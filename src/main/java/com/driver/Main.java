// Main class to demonstrate method overloading
class Main {

    // Task 1: Create a class Product inside Main class
    // This is not standard practice in Java. Typically, a class is defined in its own file.
    // However, to fulfill the request, we define the nested class here.
    public static class Product {
        // Task 3: Method with two integer parameters
        /**
         * Calculates the product of two integers.
         * @param x The first integer.
         * @param y The second integer.
         * @return The product of x and y.
         */
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Overloaded method with three integer parameters
        /**
         * Calculates the product of three integers.
         * @param x The first integer.
         * @param y The second integer.
         * @param z The third integer.
         * @return The product of x, y, and z.
         */
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Overloaded method with two double parameters
        /**
         * Calculates the product of two double-precision numbers.
         * @param x The first double.
         * @param y The second double.
         * @return The product of x and y.
         */
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        // Task 2: Create object of Product in Main function called p
        Product p = new Product();

        // Calling the methods with different parameter lists.
        // The Java compiler automatically chooses the correct method based on the
        // number and type of arguments passed.

        // Task 3: Call the method with two integers.
        int productInt = p.product(10, 20);
        System.out.println("Product of two integers: " + productInt);

        // Task 4: Call the overloaded method with three integers.
        int productIntThree = p.product(10, 20, 30);
        System.out.println("Product of three integers: " + productIntThree);
        
        // Task 5: Call the overloaded method with two doubles.
        double productDouble = p.product(10.5, 20.2);
        System.out.println("Product of two doubles: " + productDouble);
    }
}
