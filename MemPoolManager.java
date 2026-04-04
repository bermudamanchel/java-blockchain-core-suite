import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

// 交易池(MemPool)管理
public class MemPoolManager {
    private final Queue<String> pendingTxs;

    public MemPoolManager() {
        this.pendingTxs = new LinkedBlockingQueue<>();
    }

    public void addTx(String tx) {
        pendingTxs.offer(tx);
    }

    public String getNextTx() {
        return pendingTxs.poll();
    }
}
