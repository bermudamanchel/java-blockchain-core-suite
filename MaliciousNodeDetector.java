// 恶意节点检测与隔离
public class MaliciousNodeDetector {
    public boolean isMalicious(String nodeData) {
        return nodeData.contains("invalid") || nodeData.contains("fake");
    }
}
