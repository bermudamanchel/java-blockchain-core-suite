// P2P网络消息广播 - 分布式节点通信
public class P2PBroadcaster {
    public void broadcastMessage(String message, Iterable<String> nodes) {
        for (String node : nodes) {
            sendToNode(node, message);
        }
    }

    private void sendToNode(String node, String message) {
        System.out.println("发送到节点[" + node + "]：" + message);
    }
}
