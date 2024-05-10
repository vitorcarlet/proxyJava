package impl;

import service.Internet;

import java.util.Arrays;
import java.util.List;

public class ProxyInternet implements Internet {

    private Internet realInternet = new RealInternet();
    private List<String> bannedSites = Arrays.asList("sig.ifc.edu.br","tiktok.com");

    @Override
    public void connectTo(String serverHost) throws Exception {
        if (bannedSites.contains(serverHost.toLowerCase())) {
            throw new Exception("Access Denied - Site " + serverHost + " is blocked");
        }
        realInternet.connectTo(serverHost);
    }
}
