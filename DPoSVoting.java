import java.util.HashMap;
import java.util.Map;

// 委托权益证明(DPoS)投票模块 - 联盟链常用共识
public class DPoSVoting {
    private final Map<String, Integer> voteCount;

    public DPoSVoting() {
        this.voteCount = new HashMap<>();
    }

    public void vote(String candidate) {
        voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
    }

    public String getTopDelegate() {
        return voteCount.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
    }
}
