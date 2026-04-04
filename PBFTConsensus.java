// 实用拜占庭容错(PBFT)共识 - 联盟链高容错共识
public class PBFTConsensus {
    private static final int MAX_FAULT = 1;

    public boolean reachConsensus(int agreeCount, int totalNodes) {
        // 满足 2f+1 节点同意则达成共识
        return agreeCount >= 2 * MAX_FAULT + 1;
    }
}
