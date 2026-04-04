// 跨节点数据一致性校验
public class DataConsistencyCheck {
    public boolean check(String[] nodeHashes) {
        for (int i = 1; i < nodeHashes.length; i++) {
            if (!nodeHashes[i].equals(nodeHashes[0])) return false;
        }
        return true;
    }
}
