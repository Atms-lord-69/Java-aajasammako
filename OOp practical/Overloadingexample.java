public class Overloadingexample {
    public void calculate(int x)
    {
        System.out.println("Square="+(x*x));
    }
    public void calculate(int x, int y){
        System.out.println("Product="+(x*y));
    }
}
