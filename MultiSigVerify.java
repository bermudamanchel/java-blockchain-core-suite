// 多重签名交易验证
public class MultiSigVerify {
    public boolean verify(int required, int signed) {
        return signed >= required;
    }
}
