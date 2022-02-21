package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Witcher extends Hero{
    public Witcher (int health, int damage, String name){
        super(health,damage,name,SuperAbility.REVIVS);
    }
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean reviveToHero = RPG_Game.random.nextBoolean();
        if (this.getHealth() > 0 && reviveToHero == true ){
            for (int i = 0; i < heroes.length ; i++) {
                if (heroes[i].getHealth() <= 0){
                    heroes[i].setHealth(this.getHealth() + heroes[i].getHealth());
                    this.setHealth(0);
                }
            }
        }
    }
}
