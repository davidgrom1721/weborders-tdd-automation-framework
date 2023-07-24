package misc;


// Demonstration of a Singleton design pattern in the example of a Cat class


public class Cat {

    private static Cat cat; // private static Variable

    private Cat(){} // private Constructor

    public static Cat getInstance(){ // getter method that initializes and returns the object of the class via null check
        if(cat == null) {
            cat = new Cat();
        }
            return cat;
    }


    public static void main(String[] args) {

       // User story branch changes
        System.out.println("User story branch");

    }



}
