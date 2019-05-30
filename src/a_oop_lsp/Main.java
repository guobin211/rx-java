package a_oop_lsp;

/**
 * Main
 *  里氏替换原则
 *  BaseGun 分为 KillGun 和 ToyGun
 *  Soldier 依赖 KillGun
 * @author GuoBin211 on 2019-05-30 22:20
 */
public class Main {
    public static void main(String[] args) {
        Soldier soldier = new Soldier();
        soldier.killOther(new AkGun());
        soldier.killOther(new AkGun());
        ToyGun toyGun = new ToyGun();
        toyGun.shoot();
    }
}

