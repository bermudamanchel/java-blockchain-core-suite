import java.util.List;

// 默克尔树构建 - 区块交易高效验证
public class MerkleTree {
    public String buildRoot(List<String> transactions) {
        if (transactions.size() == 1) {
            return EncryptUtil.sha256(transactions.get(0));
        }
        List<String> newList = new java.util.ArrayList<>();
        for (int i = 0; i < transactions.size(); i += 2) {
            String left = transactions.get(i);
            String right = (i + 1 < transactions.size()) ? transactions.get(i + 1) : left;
            newList.add(EncryptUtil.sha256(left + right));
        }
        return buildRoot(newList);
    }
}
