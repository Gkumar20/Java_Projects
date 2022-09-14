abstract class shape{
    abstract public int area(int l,int b);
    abstract public int volume(int l,int b, int h);
}
class rectangle extends shape{
    @Override
    public int area(int l,int b){
        return l*b;
    }
    public int volume(int l,int b,int h){
        return l*b*h;
    }
}
public class abstract_proj {
    public static void main(String[] args) {
        shape b = new rectangle();
        extracted(b);
    }
    
    private static void extracted(shape b) {
        System.out.println("area of rectangel is " +b.area(5,6));
        System.out.println("volume of rectangel is " +b.volume(5,6,8));
    }
}
