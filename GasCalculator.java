// 区块链Gas费用计算
public class GasCalculator {
    private static final int GAS_PER_BYTE = 10;

    public int calculateGas(String data) {
        return data.getBytes().length * GAS_PER_BYTE;
    }
}
