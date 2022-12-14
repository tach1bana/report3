package jp.ac.uryukyu.ie.e205731;

/**
 * 敵クラス。
 *  　String name; //敵の名前<br>
 *   int hitPoint; //敵のHP<br>
 *   int attack; //敵の攻撃力<br>
 *   boolean dead; //敵の生死状態。true=死亡。<br>
 * Created by e205731 on 2022/11/15.
 */
public class Enemy extends LivingThing {
    //LivingThingにあるため不要
    //private String name;
    //private int hitPoint;
    //private int attack;
    //private boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int maximumHP, int attack) {
        super(name, attack, attack);
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * Heroへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param hero 攻撃対象
     */
    //LivingThingにあるため必要ない
    //public void attack(Hero hero){
       // if(this.dead == false){
        //int damage = (int)(Math.random() * attack);
        //System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, hero.getName(), damage);
        //hero.wounded(damage);
        //}
    //}

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */

    //woundedをoverrideする
    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint <= 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
    }
}

    //以下にgetter,setterメソッドを記述
    /**
     * private String Nameを取得するメソッド
     */
    //LivingThingにあるため必要ない
    //public String getName(){
        //return this.name;
    //}


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