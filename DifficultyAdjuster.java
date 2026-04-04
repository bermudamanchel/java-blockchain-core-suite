// 挖矿难度动态调整
public class DifficultyAdjuster {
    public int adjust(int current, long timeUsed) {
        return timeUsed < 10000 ? current + 1 : Math.max(current - 1, 1);
    }
}
