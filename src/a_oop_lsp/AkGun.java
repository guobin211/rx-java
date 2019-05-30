package a_oop_lsp;

/**
 * AkGun
 *
 * @author GuoBin211 on 2019-05-30 22:21
 */
class AkGun extends KillGun {
    private String name;
    AkGun() {
        this.name = "AkGun";
    }

    @Override
    String getName() {
        return this.name;
    }

    @Override
    void shoot() {
        System.out.println("AkGun shoot");
    }
}

