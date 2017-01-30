
package org.soa.ws.tp6;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ConvertisseurImplService", targetNamespace = "http://tp6.ws.soa.org/", wsdlLocation = "http://localhost:5678/convertisseurws?wsdl")
public class ConvertisseurImplService
    extends Service
{

    private final static URL CONVERTISSEURIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException CONVERTISSEURIMPLSERVICE_EXCEPTION;
    private final static QName CONVERTISSEURIMPLSERVICE_QNAME = new QName("http://tp6.ws.soa.org/", "ConvertisseurImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:5678/convertisseurws?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONVERTISSEURIMPLSERVICE_WSDL_LOCATION = url;
        CONVERTISSEURIMPLSERVICE_EXCEPTION = e;
    }

    public ConvertisseurImplService() {
        super(__getWsdlLocation(), CONVERTISSEURIMPLSERVICE_QNAME);
    }

    public ConvertisseurImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONVERTISSEURIMPLSERVICE_QNAME, features);
    }

    public ConvertisseurImplService(URL wsdlLocation) {
        super(wsdlLocation, CONVERTISSEURIMPLSERVICE_QNAME);
    }

    public ConvertisseurImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONVERTISSEURIMPLSERVICE_QNAME, features);
    }

    public ConvertisseurImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConvertisseurImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Convertisseur
     */
    @WebEndpoint(name = "ConvertisseurImplPort")
    public Convertisseur getConvertisseurImplPort() {
        return super.getPort(new QName("http://tp6.ws.soa.org/", "ConvertisseurImplPort"), Convertisseur.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Convertisseur
     */
    @WebEndpoint(name = "ConvertisseurImplPort")
    public Convertisseur getConvertisseurImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://tp6.ws.soa.org/", "ConvertisseurImplPort"), Convertisseur.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONVERTISSEURIMPLSERVICE_EXCEPTION!= null) {
            throw CONVERTISSEURIMPLSERVICE_EXCEPTION;
        }
        return CONVERTISSEURIMPLSERVICE_WSDL_LOCATION;
    }

}
