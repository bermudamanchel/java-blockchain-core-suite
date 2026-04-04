import java.io.*;
import java.util.List;

// 区块链数据持久化存储 - 本地文件存储账本
public class ChainStorage {
    private static final String FILE_PATH = "blockchain.dat";

    public void saveChain(List<Block> chain) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(chain);
            System.out.println("区块链数据已持久化");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public List<Block> loadChain() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            return (List<Block>) ois.readObject();
        } catch (Exception e) {
            return null;
        }
    }
}
