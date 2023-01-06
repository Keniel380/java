public class Truck extends Car { 
    private int weight; 
    public Truck(int speed, double regularPrice, String colour, int weight){
        super(speed, regularPrice, colour);
        this.weight = weight;
    }

    public double getSalePrice(){
        return super.getSalePrice() * (weight > 2000 ? 0.1:0.2);
    }
}