package a_oop.a_oop_isp;

/**
 * OneGirl
 *
 * @author GuoBin211 on 2019-05-30 23:13
 */
public class OneGirl extends BasePrettyGirl {

    @Override
    public void faceGood() {
        System.out.println("OneGirl faceGood");
    }

    @Override
    public void voiceGood() {
        System.out.println("OneGirl voiceGood");
    }
}

