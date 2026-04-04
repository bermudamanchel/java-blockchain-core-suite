import java.util.List;

// 链上数据查询接口
public class ChainDataQuery {
    public Block queryByIndex(List<Block> chain, int index) {
        return index < chain.size() ? chain.get(index) : null;
    }
}
