// 链上资产发行工具
public class AssetIssuer {
    public String issueAsset(String name, int totalSupply) {
        return "ISSUE|" + name + "|" + totalSupply + "|" + System.currentTimeMillis();
    }
}
