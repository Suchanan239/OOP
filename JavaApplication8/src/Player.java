public class Player {
    private final String name;
    private final int attackDamage = 2;
    private Houses houses;
    private int hp = 20;
    private int mana = 50;
    
    public Player(){
        this("", 0);
        this.houses = null;
        this.mana = 0;
    }
    
    public Player(String name){
        this.name = name;
    }
    
    public Player(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public Houses getHouses() {
        return houses;
    }

    public int getHp() {
        return hp;
    }

    public int getMana() {
        return mana;
    }

    public void setHouses(Houses houses) {
        this.houses = houses;
    }

    public void setHp(int hp) {
        if(hp <= 0){
            this.hp = 0;
        }
        else if(hp >= 20){
            this.hp = 20;
        }
    }

    public void setMana(int mana) {
        if(mana < 0){
            this.mana = 0;
        }
        else if(mana > 50){
            this.hp = 50;
        }
    }
    
    @Override
    public String toString(){
        return ("[Player] : "+name+" HP: "+hp+" Mana: "+mana+" || "+houses);
    }
    
    public boolean equals(Player player){
        return ((this.name.equals(player.getName())) && (this.houses.equals(player.getHouses())));
    }
    
    public void attack(Player target, Spell spell){
        if(getHouses() instanceof Hufflepuff){
            ((Hufflepuff)houses).attackSpell(this, target, spell);
        }
        else if(getHouses() instanceof Gryffindor){
            ((Gryffindor)houses).attackSpell(this, target, spell);
        }
        if(target.getHp() == 0){
            System.out.println("[DEAD]: "+target.getName()+" was killed by "+name);
        }
    }
    
    public void protectFromPlayer(Player target){
        if(getHouses() instanceof Gryffindor) {
            ((Gryffindor)houses).defense(this, target);
        }
        else if(getHouses() instanceof Hufflepuff) {
            ((Hufflepuff)houses).defense(this, target);
        }
    }
}
