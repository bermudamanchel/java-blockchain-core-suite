// 分布式随机数生成 - 链上公平随机
public class DistributedRandom {
    public long generateRandom(String blockHash) {
        return Long.parseLong(blockHash.substring(0, 16), 16);
    }
}
