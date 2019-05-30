package a_oop_lsp;

/**
 * KillGun
 *
 * @author GuoBin211 on 2019-05-30 22:33
 */
abstract class KillGun extends BaseGun {
    // BaseGun只shoot,KillGun有自己的Name
    abstract String getName();

    @Override
    void shoot() {

    }
}

