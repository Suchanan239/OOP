
public class Novice extends Player{
    public Novice(){
        this.setHP(10);
        this.setMP(10);
        this.setATK(5);
    }
    public void addEquipment(Item i){
        i.use(this);
    }
    @Override
    public void attack(Player P){
        P.attacked(getATK());
    }
    @Override
    public void attacked(double n){
        setHP(getHP()-n);
    }
}
