// 区块时间戳校准
public class TimestampCalibrator {
    public long calibrate(long nodeTime) {
        long systemTime = System.currentTimeMillis();
        // 时间偏差不超过1小时
        return Math.abs(nodeTime - systemTime) < 3600000 ? nodeTime : systemTime;
    }
}
