import java.util.HashSet;
import java.util.Set;

// 联盟链准入权限
public class ConsortiumChainAuth {
    private final Set<String> allowedNodes;

    public ConsortiumChainAuth() {
        this.allowedNodes = new HashSet<>();
    }

    public void allowNode(String node) {
        allowedNodes.add(node);
    }

    public boolean isAllowed(String node) {
        return allowedNodes.contains(node);
    }
}
