// 加密货币转账交易
public class TokenTransfer {
    public String createTransferTx(String from, String to, int amount) {
        return "TRANSFER|" + from + "|" + to + "|" + amount;
    }
}
