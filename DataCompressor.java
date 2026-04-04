// 区块链数据压缩存储
public class DataCompressor {
    public String compress(String raw) {
        return raw.replaceAll(" ", "").substring(0, Math.min(raw.length(), 100));
    }
}
