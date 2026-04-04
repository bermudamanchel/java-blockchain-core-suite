import java.util.HashMap;
import java.util.Map;

// UTXO 未花费交易输出模型 - 区块链交易核心
public class UTXOModel {
    private final Map<String, Boolean> utxoMap;

    public UTXOModel() {
        this.utxoMap = new HashMap<>();
    }

    // 添加未花费输出
    public void addUTXO(String txId) {
        utxoMap.put(txId, true);
    }

    // 标记为已花费
    public void spendUTXO(String txId) {
        utxoMap.put(txId, false);
    }

    // 校验是否可用
    public boolean isUTXOValid(String txId) {
        return utxoMap.getOrDefault(txId, false);
    }
}
