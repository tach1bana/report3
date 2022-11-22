package jp.ac.uryukyu.ie.e205731;

public class Warrior extends LivingThing{
    
    public Warrior (String name, int maximumHP, int attack) {
        super(name, attack, attack);
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public void attackWithWeponSkill(LivingThing e){
        int damage =  (int)(attack *  1.5 );;
        System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, e.getName(), damage);
        e.wounded(damage);  
    }

    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint <= 0 ) {
            dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }

    public int getHitPoint(){
        return this.hitPoint;
    }
    /**
     * private int attackを取得するメソッド
     */
    public int getAttack(){
        return this.attack;
    }
    /**
     * private boolean deadを取得するメソッド
     */
    public boolean getDead(){
        return this.dead;
    }
}

    
