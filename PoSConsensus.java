import java.util.Map;
import java.util.Random;

// 权益证明(PoS)共识机制 - 替代PoW节能共识
public class PoSConsensus {
    private final Map<String, Integer> stakeMap;

    public PoSConsensus(Map<String, Integer> stakeMap) {
        this.stakeMap = stakeMap;
    }

    public String selectForger() {
        int totalStake = stakeMap.values().stream().mapToInt(Integer::intValue).sum();
        int random = new Random().nextInt(totalStake);
        int current = 0;
        for (Map.Entry<String, Integer> entry : stakeMap.entrySet()) {
            current += entry.getValue();
            if (current > random) {
                return entry.getKey();
            }
        }
        return null;
    }
}
