
public class Test {
    public static void main(String[] args) {
       double a = 4;
       double b = 8;
       double c = 3;
       double x_1;
       double x_2;
       x_1 = ((-b) + Math.sqrt((b*b) - (4*a*c))) / (2*a);
       x_2 = ((-b) - Math.sqrt((b*b) - (4*a*c))) / (2*a);
       System.out.println(x_1);
       System.out.println(x_2);
    }
    
}
