package net.sync;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/*
 * SyncService
 * @Author guobin201314@gmail.com on 2019-06-07 17:23
 */
public class SyncService {
    public int getX() {
        return x;
    }

    public void incrementX() {
        this.x++;
    }

    private int x;

    public int getY() {
        return y;
    }

    public void incrementY() {
        this.y++;
    }

    private int y;

    /**
     * 同步数据管理器
     */
    abstract class SyncManage {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        protected SyncService syncService = new SyncService();
        private List<SyncService> list = Collections.synchronizedList(new ArrayList<SyncService>());

        public synchronized SyncService getSyncService() {
            return new SyncService(syncService.getX(), syncService.getY());
        }

        protected void store(SyncService syncService) {
            list.add(syncService);
            try {
                TimeUnit.MILLISECONDS.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public abstract void increment();
    }

    /**
     * x y 不一致出现异常
     */
    public class SyncServiceNotEqualException extends RuntimeException {
        SyncServiceNotEqualException() {
            super("SyncServiceNotEqualException" + SyncService.this);
        }
    }

    public void check() {
        if (x != y) {
            throw new SyncServiceNotEqualException();
        }
    }

    SyncService() {
        this.x = 0;
        this.y = 0;
    }

    SyncService(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x: " + x + ";y: " + y;
    }
}
