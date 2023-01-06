 public class MyOwnAutoShop{
    public static void main(String[] args){
        Truck truck = new Truck (180,50000000,"blue",3000);
        Ford ford = new Ford (220,3000000,"green",1994, 35);
        Sedan sedan = new Sedan (260,10000000,"maroon", 40);
        Car car = new Car (100,100,"white");

            System.out.println(" truck " + truck.getSalePrice());
            System.out.println(" ford " + ford.getSalePrice());
            System.out.println(" sedan " + sedan.getSalePrice());
            System.out.println(" car " + car.getSalePrice());
                }
            }
