import java.util.Arrays;
import java.util.List;

// 智能合约权限控制
public class ContractPermission {
    private static final List<String> ADMIN_LIST = Arrays.asList("admin001", "root001");

    public boolean hasPermission(String address) {
        return ADMIN_LIST.contains(address);
    }
}
