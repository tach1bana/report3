package jp.ac.uryukyu.ie.e205731;

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Hero extends LivingThing {
    //LivingThingにあるため必要ない
    // private String name;
    // private int hitPoint;
    // private int attack;
    // private boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public Hero (String name, int maximumHP, int attack) {
        super(name, attack, attack);
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * Enemyへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param e 攻撃対象
     */
    public void attack(Enemy e){
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, e.getName(), damage);
        e.wounded(damage);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint <= 0 ) {
            dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
    }
}

    //以下にgetter,setterメソッドを記述
    /**
     * private String Nameを取得するメソッド
     */
    //LivingThingにあるため必要ない
    // public String getName(){
    //     return this.name;
    // }
    /**
     * private int hitPointを取得するメソッド
     */
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