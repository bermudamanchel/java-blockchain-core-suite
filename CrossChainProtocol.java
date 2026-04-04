// 跨链交易基础协议
public class CrossChainProtocol {
    public String buildCrossTx(String fromChain, String toChain, String amount) {
        return "CROSS|" + fromChain + "|" + toChain + "|" + amount + "|" + System.currentTimeMillis();
    }
}
