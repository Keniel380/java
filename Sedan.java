public class Sedan extends Car{
    private int length;
    public Sedan(int speed, double regularPrice, String colour, int length){
        super(speed, regularPrice, colour);
        this.length = length;
    }

public double getSalePrice(){
    return super. getSalePrice() * (length < 20 ? 0.05:0.1);
}    
}