// 零知识证明基础工具
public class ZKProofTool {
    public String generateProof(String secret) {
        return EncryptUtil.sha256("zk-" + secret);
    }
}
