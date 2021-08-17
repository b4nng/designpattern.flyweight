public class NetworkInfo {
    String macAddress;
    String ispInfo;
    String dnsServer;
    String region;

    public NetworkInfo(String macAddress, String ispInfo, String dnsServer, String region) {
        this.macAddress = macAddress;
        this.ispInfo = ispInfo;
        this.dnsServer = dnsServer;
        this.region = region;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getIspInfo() {
        return ispInfo;
    }

    public void setIspInfo(String ispInfo) {
        this.ispInfo = ispInfo;
    }

    public String getDnsServer() {
        return dnsServer;
    }

    public void setDnsServer(String dnsServer) {
        this.dnsServer = dnsServer;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
