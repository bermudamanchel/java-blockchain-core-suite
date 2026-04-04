// 默克尔证明验证
public class MerkleProof {
    public boolean verifyProof(String txHash, String root, List<String> proof) {
        String current = txHash;
        for (String p : proof) {
            current = EncryptUtil.sha256(current + p);
        }
        return current.equals(root);
    }
}
