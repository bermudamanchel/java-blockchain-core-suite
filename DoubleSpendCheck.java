import java.util.HashSet;
import java.util.Set;

// 防双花交易检测
public class DoubleSpendCheck {
    private final Set<String> usedTx;

    public DoubleSpendCheck() {
        this.usedTx = new HashSet<>();
    }

    public boolean isDoubleSpend(String txId) {
        if (usedTx.contains(txId)) return true;
        usedTx.add(txId);
        return false;
    }
}
