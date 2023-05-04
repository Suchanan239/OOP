
public class Mage extends Player{
    public Mage(){
        this.setHP(10);
        this.setMP(20);
        this.setATK(5);
    }
    public void addEquipment(Item i){
        i.use(this);
    }
    @Override
    public void attack(Player P){
        P.attacked(getATK()*(2.5));
        setMP(getMP()-5);
    }
    @Override
    public void attacked(double n){
        setHP(getHP()-n);
    }
}
