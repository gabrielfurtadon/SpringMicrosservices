package br.com.Gabriel.hrpayroll.services;

import org.springframework.stereotype.Service;

import br.com.Gabriel.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(Long WorkerId, int days) {
		return new Payment("Gabriel", 300.0, days); //qtd de dias pegando do argumento
	}
	
}
