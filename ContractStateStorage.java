import java.util.HashMap;
import java.util.Map;

// 智能合约状态持久化
public class ContractStateStorage {
    private final Map<String, String> stateMap;

    public ContractStateStorage() {
        this.stateMap = new HashMap<>();
    }

    public void saveState(String key, String value) {
        stateMap.put(key, value);
    }

    public String getState(String key) {
        return stateMap.get(key);
    }
}
