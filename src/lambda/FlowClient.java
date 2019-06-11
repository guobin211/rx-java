package lambda;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

/*
 * FlowClient
 * @Author guobin201314@gmail.com on 2019-06-08 08:18
 */
public class FlowClient {
    public static void main(String[] args) throws Exception {
        // 1定义发布者
        SubmissionPublisher<Integer> publisher = new SubmissionPublisher<Integer>();
        // 2定义订阅者
        Flow.Subscriber<Integer> subscriber = new Flow.Subscriber<Integer>() {
            private Flow.Subscription subscription;
            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                System.out.println("onSubscribe----->");
                this.subscription = subscription;
                this.subscription.request(1);
                System.out.println("request----->");
            }

            @Override
            public void onNext(Integer item) {
                System.out.println("onNext----->");
                this.subscription.request(1);
                // this.subscription.cancel();
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("onError----->");
            }

            @Override
            public void onComplete() {
                System.out.println("onComplete----->");
            }
        };
        // 3关联订阅
        publisher.subscribe(subscriber);
        int data = 123456;
        // 4发布数据
        publisher.submit(data);
        // 5关闭
        publisher.close();
    }
}
