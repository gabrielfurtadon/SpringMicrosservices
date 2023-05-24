package br.com.Gabriel.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.Gabriel.hrpayroll.entities.Payment;
import br.com.Gabriel.hrpayroll.entities.Worker;

@Service
public class PaymentService {
	
	@Value("${hr-worker.host}") //pegar o valor no application properties
	private String workerHost;
	
	@Autowired
	private RestTemplate restTemplate;

	public Payment getPayment(Long WorkerId, int days) {
		
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("id", String.valueOf(WorkerId));
		
		Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariables);
		return new Payment(worker.getName(), worker.getDailyIncome(), days); //qtd de dias pegando do argumento
	}
	
}
