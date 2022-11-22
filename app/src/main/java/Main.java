import jp.ac.uryukyu.ie.e205731.*;

public class Main {
    public static void main(String[] args){
        Warrior Warrior = new Warrior("勇者", 10, 5);
        Enemy enemy = new Enemy("スライム", 6, 3);

        System.out.printf("%s vs. %s\n", Warrior.getName(), enemy.getName());

        int turn = 0;
        while( Warrior.getDead() == false && enemy.getDead() == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            Warrior.attackWithWeponSkill(enemy);
            enemy.attack(Warrior);
        }
        System.out.println("戦闘終了");
    }

    
}