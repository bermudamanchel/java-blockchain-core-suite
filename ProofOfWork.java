// 工作量证明(PoW)挖矿算法 - 比特币核心机制
public class ProofOfWork {
    private static final int DIFFICULTY = 4;

    public String mine(String previousHash, String data) {
        String hash = EncryptUtil.sha256(previousHash + data);
        int nonce = 0;
        // 满足难度条件：哈希前N位为0
        while (!hash.substring(0, DIFFICULTY).equals(getDifficultyString())) {
            nonce++;
            hash = EncryptUtil.sha256(previousHash + data + nonce);
        }
        System.out.println("挖矿成功！Nonce值：" + nonce + " 哈希：" + hash);
        return hash;
    }

    private String getDifficultyString() {
        return "0".repeat(DIFFICULTY);
    }
}
