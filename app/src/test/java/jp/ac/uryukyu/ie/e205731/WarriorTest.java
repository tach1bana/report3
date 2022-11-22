package jp.ac.uryukyu.ie.e205731;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test void attackWithWeponSkillTest() {
        int defaultHeroHp = 100;
        Warrior demoHero1 = new Warrior("デモ勇者", defaultHeroHp, 100);
        Enemy slime = new Enemy("スライムもどき", 10, 100);
        for(int count=0; count<10; count++){
            demoHero1.attack(slime); // over kill
        }
        slime.attack(demoHero1);
        assertEquals(defaultHeroHp, demoHero1.hitPoint);
    }
    @Test void attackWithWeponSkillTest2(){
        int defaultHeroHp = 100;
        Warrior demoHero2 = new Warrior("デモ勇者", defaultHeroHp, 100);
        Enemy slime = new Enemy("スライムもどき", 10, 100);
        for(int count=0; count<10; count++){
            demoHero2.attack(slime); // over kill
        }
        slime.attack(demoHero2);
        assertEquals(defaultHeroHp, demoHero2.hitPoint);
    }
    @Test void attackWithWeponSkillTest3(){
        int defaultHeroHp = 100;
        Warrior demoHero3 = new Warrior("デモ勇者", defaultHeroHp, 100);
        Enemy slime = new Enemy("スライムもどき", 10, 100);
        for(int count=0; count<10; count++){
            demoHero3.attack(slime); // over kill
        }
        slime.attack(demoHero3);
        assertEquals(defaultHeroHp, demoHero3.hitPoint);
    }
}
