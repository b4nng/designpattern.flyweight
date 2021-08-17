public class Address {
    String ip;
    NetworkInfo network;

    public Address(String ip, NetworkInfo network) {
        this.ip = ip;
        this.network = network;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public NetworkInfo getNetwork() {
        return network;
    }

    public void setNetwork(NetworkInfo network) {
        this.network = network;
    }

    public String getAddress() {
        return "IP: "+this.getIp()+", MAC:"+
                this.getNetwork().getMacAddress()+"\n"+
                this.getNetwork().getIspInfo()+" "+this.getNetwork().getRegion()+"\n"+
                "DNS: "+this.getNetwork().getDnsServer()+"\n";
    }
}
