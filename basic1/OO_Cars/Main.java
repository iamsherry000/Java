package basic1.OO_Cars;

public class Main {
    public static void main(String[] args) {
        // object = An entitu that holds data(attributes)
        //          and can perform actions (methods)
        //          It is a reference data type

        // class : 定義特性和行為，不能實體操作 (class)
        // object : 用類別建立實體 (new)

        Car car = new Car(); // 實體化 car 物件
        //System.out.println(car.band);
        car.start();
        car.UrgentBreak();
        car.start();
        car.stop();
    }
}
