package Chapter2;

public class AtomicityExample
{
    private HostInfo hostInfo;
    public void updateHostInfo(String ip, int port)
    {
        hostInfo.setIp(ip);
        hostInfo.setPort(port);
    }
    public void connectToHost()
    {
        String ip = hostInfo.getIp();
        int port = hostInfo.getPort();
        connectToHost(ip, port);
    }
    private void connectToHost(String ip, int port)
    {

    }
    public static class HostInfo
    {
        private String ip;
        private int port;
        public void setIp(String ip)
        {
            this.ip = ip;
        }
        public void setPort(int port)
        {
            this.port = port;
        }
        public String getIp()
        {
            return ip;
        }
        public int getPort()
        {
            return port;
        }
    }
}


