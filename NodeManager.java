import java.util.HashSet;
import java.util.Set;

// 区块链节点注册与管理
public class NodeManager {
    private final Set<String> nodeList;

    public NodeManager() {
        this.nodeList = new HashSet<>();
    }

    public void registerNode(String nodeAddress) {
        nodeList.add(nodeAddress);
    }

    public void removeNode(String nodeAddress) {
        nodeList.remove(nodeAddress);
    }

    public Set<String> getAllNodes() {
        return nodeList;
    }
}
