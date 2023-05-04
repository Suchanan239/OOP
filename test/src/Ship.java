
public class Ship extends Vehicle implements Floatable{
    public Ship(){
        super(0.0);
    }
    public Ship(double fuel){
        super(fuel);
    }
    public void move(){
        
    }
    public void move(int distance){
        for(int x = 1; x <= distance; x++){
            if(fuel < 50){
                System.out.println("Fuel is not enough");
                break;
            }
            else{
                fl0at();
            }
        }
    }
    @Override
    public void fl0at(){
        if(fuel >= 50){
            fuel -= 50;
            System.out.println("Ship moves");
        }
        else{
            System.out.println("Fuel is not enough.");
        }
    }
    @Override
    public void startEngine(){
        if(fuel >= 10){
            fuel -= 10;
            System.out.println("Engine starts");
        }
        else{
            System.out.println("Fuel is not enough.");
        }
    }
    @Override
    public void stopEngine(){
        System.out.println("Engine stops");
    }
    @Override
    public void honk(){
        System.out.println("Shhhhh");
    }
}
