
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import org.soa.ws.tp6.Convertisseur;
import org.soa.ws.tp6.ConvertisseurImplService;


public class ConvertisseurClient {

	public static void main(String[] args) {
		
		ConvertisseurImplService service = new ConvertisseurImplService();
		Convertisseur stub = service.getConvertisseurImplPort();
		
		//1
		BindingProvider bp = (BindingProvider) stub;
		Map<String, Object> reqContext = bp.getRequestContext();
		
		//2
		HashMap<String, List<String>> headers = new HashMap<String, List<String>>();
		headers.put("username", Collections.singletonList("blabla"));
		headers.put("password", Collections.singletonList("soaws"));
		
		//3
		reqContext.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
		
		//4
		System.out.println(stub.getDinarFromEuro(10));
	}

}
