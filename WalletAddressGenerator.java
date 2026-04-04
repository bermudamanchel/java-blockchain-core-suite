// 数字钱包地址生成
public class WalletAddressGenerator {
    public String generateAddress(PublicKey publicKey) {
        String hash = EncryptUtil.sha256(publicKey.toString());
        return "0x" + hash.substring(hash.length() - 40);
    }
}
