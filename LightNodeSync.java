// 轻节点区块同步
public class LightNodeSync {
    public String requestBlockHeader(int height) {
        return "GET_HEADER|" + height;
    }
}
