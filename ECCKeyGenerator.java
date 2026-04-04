import java.security.*;
import java.security.spec.ECGenParameterSpec;

// 椭圆曲线加密(ECC)密钥生成 - 区块链非对称加密
public class ECCKeyGenerator {
    private KeyPair keyPair;

    public ECCKeyGenerator() {
        try {
            KeyPairGenerator generator = KeyPairGenerator.getInstance("EC");
            ECGenParameterSpec ecSpec = new ECGenParameterSpec("secp256k1");
            generator.initialize(ecSpec, new SecureRandom());
            this.keyPair = generator.generateKeyPair();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public PublicKey getPublicKey() {
        return keyPair.getPublic();
    }

    public PrivateKey getPrivateKey() {
        return keyPair.getPrivate();
    }
}
