// 钱包私钥加密存储
public class WalletKeyStorage {
    public String encryptKey(String privateKey, String password) {
        return EncryptUtil.sha256(privateKey + password);
    }
}
