import java.util.List;

// 区块链账本完整性校验
public class LedgerValidator {
    public boolean validateFullLedger(List<Block> chain) {
        if (chain.isEmpty()) return true;
        Block prev = chain.get(0);
        for (int i = 1; i < chain.size(); i++) {
            Block curr = chain.get(i);
            if (!curr.getPreviousHash().equals(prev.getHash())) return false;
            if (curr.getHash().isEmpty()) return false;
            prev = curr;
        }
        return true;
    }
}
