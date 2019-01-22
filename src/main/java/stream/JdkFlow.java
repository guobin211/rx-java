package stream;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

/**
 * stream   JdkFlow
 *
 * @author guobin201314@gmail.com on 2019-01-22
 * @version 1.0.0 by JDK 1.8
 */
public class JdkFlow {
    public static void main(String[] args) {
        // 1. 信息发布者
        SubmissionPublisher<String> submissionPublisher = new SubmissionPublisher();

        // 2.订阅者
        Flow.Subscriber<String> stringSubscriber = new Flow.Subscriber<String>() {

            private Flow.Subscription subscription;

            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                this.subscription = subscription;
                this.subscription.request(1);
            }

            @Override
            public void onNext(String item) {
                // 处理接收到的消息
                System.out.println(item);
                // 再次请求消息
                this.subscription.request(1);
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
                // 取消订阅
                this.subscription.cancel();
            }

            @Override
            public void onComplete() {
                System.out.println("Completed");
            }
        };

        // 3.注册订阅
        submissionPublisher.subscribe(stringSubscriber);

        int len =  10;
        for (int i = 0; i < len; i++) {
            // 4.发布消息
            submissionPublisher.submit("发布消息" + i);
        }

        // 5.关闭发布者
        submissionPublisher.close();

        // 6.主线程延迟停止, 否则数据没有消费就退出
        try {
            Thread.currentThread().join(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
