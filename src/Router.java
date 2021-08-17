import java.util.ArrayList;
import java.util.List;

public class Router {
    private List<Address> addresses = new ArrayList<>();

    public void routerRegister(String ip, String macAddress, String ispInfo, String dnsServer, String region){
        NetworkInfo networkInfo = NetworkInfoFactory.getNetworkInfo( macAddress,  ispInfo,  dnsServer,  region);
        Address address = new Address(ip, networkInfo);
        addresses.add(address);
    }

    public List<String> getAddresses(){
        List<String> addresses = new ArrayList<>();
        for (Address address : this.addresses){
            addresses.add(address.getAddress());
        }
        return addresses;
    }
}
