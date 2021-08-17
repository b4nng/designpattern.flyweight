import java.util.HashMap;
import java.util.Map;

public class NetworkInfoFactory {
    private static Map<String, NetworkInfo> networkInfos = new HashMap<>();

    public static NetworkInfo getNetworkInfo(String macAddress,
                                             String ispInfo,
                                             String dnsServer,
                                             String region) {
        NetworkInfo networkInfo = networkInfos.get(macAddress);
        if (networkInfo == null) {
            networkInfo = new NetworkInfo(macAddress, ispInfo, dnsServer, region);
            networkInfos.put(macAddress, networkInfo);
        }
        return networkInfo;
    }

    public static int getSizeNetworkInfo() { return networkInfos.size(); }
}



