public class Ford extends Car{
    private int year;
    public int manufacturerDiscount;

    public Ford(int speed, double regularPrice, String colour, int year, int manufacturerDiscount){
        super(speed, regularPrice, colour);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    public double getSalePrice(){
        return super.getSalePrice() - manufacturerDiscount;
    }
}