package a.oop.lsp;

/**
 * Soldier
 *
 * @author GuoBin211 on 2019-05-30 22:23
 */
class Soldier {
    void killOther(KillGun killGun) {
        killGun.shoot();
        System.out.println("Soldier has kill other with " + killGun.getName());
    }
}

