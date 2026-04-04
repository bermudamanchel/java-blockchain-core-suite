// 链上日志记录
public class ChainLogger {
    public void log(String level, String message) {
        System.out.println("[" + level + "] " + System.currentTimeMillis() + " - " + message);
    }
}
