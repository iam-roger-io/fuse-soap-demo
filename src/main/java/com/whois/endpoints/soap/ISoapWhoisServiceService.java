package com.whois.endpoints.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.6
 * 2020-07-13T18:44:51.357-03:00
 * Generated source version: 3.3.6
 *
 */
@WebServiceClient(name = "ISoapWhoisServiceService",
                  wsdlLocation = "file:/home/rosantos/workspace-jb421/fuse-soap/src/main/resources/wsdl/whois.wsdl",
                  targetNamespace = "http://soap.endpoints.whois.com/")
public class ISoapWhoisServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://soap.endpoints.whois.com/", "ISoapWhoisServiceService");
    public final static QName ISoapWhoisServicePort = new QName("http://soap.endpoints.whois.com/", "ISoapWhoisServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/rosantos/workspace-jb421/fuse-soap/src/main/resources/wsdl/whois.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ISoapWhoisServiceService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/home/rosantos/workspace-jb421/fuse-soap/src/main/resources/wsdl/whois.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ISoapWhoisServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ISoapWhoisServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ISoapWhoisServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ISoapWhoisServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ISoapWhoisServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ISoapWhoisServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns ISoapWhoisService
     */
    @WebEndpoint(name = "ISoapWhoisServicePort")
    public ISoapWhoisService getISoapWhoisServicePort() {
        return super.getPort(ISoapWhoisServicePort, ISoapWhoisService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ISoapWhoisService
     */
    @WebEndpoint(name = "ISoapWhoisServicePort")
    public ISoapWhoisService getISoapWhoisServicePort(WebServiceFeature... features) {
        return super.getPort(ISoapWhoisServicePort, ISoapWhoisService.class, features);
    }

}
