package a_oop.a_oop_lsp;

/**
 * AugGun
 *
 * @author GuoBin211 on 2019-05-30 22:21
 */
class AugGun extends KillGun {
    private String name;
    AugGun() {
        this.name = "AugGun";
    }

    @Override
    String getName() {
        return this.name;
    }

    @Override
    void shoot() {
        System.out.println("AugGun shoot");
    }
}

