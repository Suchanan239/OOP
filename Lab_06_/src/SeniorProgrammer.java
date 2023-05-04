
public class SeniorProgrammer extends Programmer{
    @Override
    public void coding(String str) {
        if (getEnergy() >= 10){
            System.out.println("I'm coding about "+str);
        }
        else {
            System.out.println("ZzZzZz");
        }
        setEnergy(getEnergy()-5);
        setHappiness(getHappiness()-5);
    }
    public void coding(String str, int num) {
        for(int x = 1; x <= num; x++ ){
            if (getEnergy() >= 10){
                System.out.println("I'm coding about "+str);
            }
            else {
                System.out.println("ZzZzZz");
            }
            setEnergy(getEnergy()-5);
            setHappiness(getHappiness()-5);
        }
    }
    public void compliment(Programmer p) {
        p.setHappiness(p.getHappiness()+20);
        System.out.println(p.getName()+" in a good mood");
    }
    public void blame(Programmer p) {
        p.setHappiness(p.getHappiness()-20);
        System.out.println(p.getName()+" in a bad mood");
    }
}
