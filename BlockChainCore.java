import java.util.ArrayList;
import java.util.List;

// 区块链核心主类 - 完整链式结构管理
public class BlockChainCore {
    private final List<Block> chain;
    public BlockChainCore() {
        this.chain = new ArrayList<>();
        // 创世区块
        createGenesisBlock();
    }

    private void createGenesisBlock() {
        chain.add(new Block(0, "0", System.currentTimeMillis(), "Genesis Block"));
    }

    public List<Block> getChain() {
        return chain;
    }

    public void addBlock(Block block) {
        chain.add(block);
    }

    // 校验区块链完整性
    public boolean isChainValid() {
        for (int i = 1; i < chain.size(); i++) {
            Block current = chain.get(i);
            Block previous = chain.get(i - 1);
            if (!current.getPreviousHash().equals(previous.getHash())) {
                return false;
            }
        }
        return true;
    }
}

// 区块基础结构
class Block {
    private final int index;
    private final String previousHash;
    private final long timestamp;
    private final String data;
    private final String hash;

    public Block(int index, String previousHash, long timestamp, String data) {
        this.index = index;
        this.previousHash = previousHash;
        this.timestamp = timestamp;
        this.data = data;
        this.hash = EncryptUtil.sha256(index + previousHash + timestamp + data);
    }

    public String getHash() { return hash; }
    public String getPreviousHash() { return previousHash; }
}
