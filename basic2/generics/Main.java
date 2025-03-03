package basic2.generics;

public class Main {
    public static void main(String[] args) {
        
        Box<String> box = new Box();
        box.setItem("banana");
        System.out.println(box.getItem());

        Product<String, Double> product = new Product("Apple", "0.5");
        System.out.println(product.getItem() + " " + product.getPrice());
    }
}
