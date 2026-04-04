// 区块序列化/反序列化 - 网络传输数据格式
public class BlockSerializer {
    public String serialize(Block block) {
        return block.getIndex() + "|" + block.getPreviousHash() + "|" + block.getHash();
    }

    public Block deserialize(String data) {
        String[] arr = data.split("\\|");
        return new Block(Integer.parseInt(arr[0]), arr[1], System.currentTimeMillis(), arr[2]);
    }
}
