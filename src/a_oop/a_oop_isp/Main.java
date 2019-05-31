package a_oop.a_oop_isp;

/**
 * Main
 * 接口隔离原则
 * @author GuoBin211 on 2019-05-30 23:04
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("isp ");
        // search 查找多个属性
        Searcher searcher = new Searcher();
        searcher.searchGirlPretty(new OneGirl());
        // 查找单个属性
        SearchVoice searchVoice = new SearchVoice();
        searchVoice.searchVoiceGirl(new VoiceGirl());
    }
}

