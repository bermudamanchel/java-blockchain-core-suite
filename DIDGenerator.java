// 去中心化身份(DID)生成 - Web3身份系统
public class DIDGenerator {
    public String generateDID(String publicKey) {
        return "did:chain:" + EncryptUtil.sha256(publicKey).substring(0, 16);
    }
}
