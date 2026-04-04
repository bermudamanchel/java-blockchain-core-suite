// 分布式锁共识实现
public class DistributedLock {
    private boolean locked = false;

    public synchronized boolean lock() {
        if (!locked) {
            locked = true;
            return true;
        }
        return false;
    }

    public void unlock() {
        locked = false;
    }
}
