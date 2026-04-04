import java.security.PrivateKey;
import java.security.Signature;

// 交易签名与验签 - 保证交易不可篡改
public class TransactionSigner {
    public byte[] signTransaction(String data, PrivateKey privateKey) {
        try {
            Signature signature = Signature.getInstance("SHA256withECDSA");
            signature.initSign(privateKey);
            signature.update(data.getBytes());
            return signature.sign();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
