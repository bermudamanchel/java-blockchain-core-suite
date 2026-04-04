// 区块链网络心跳检测
public class HeartbeatDetector {
    public boolean isNodeAlive(long lastBeat) {
        return System.currentTimeMillis() - lastBeat < 30000;
    }
}
