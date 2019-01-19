package ISP;

/**
 * ISP   Main
 *
 * @author guobin201314@gmail.com on 2019-01-19
 * @version 1.0.0 by JDK 1.8
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("start...");
        // Searcher 继承 BasePrettyGirl
        Searcher searcher = new Searcher();
        searcher.searchActress(new AngelaBaby());

        // SearcherB 只需要 INiceFigure
        SearcherB searcherB = new SearcherB();
        searcherB.searchActress(new SuperModel());

        searcherB.searchActress(new AngelaBaby());
    }
}
