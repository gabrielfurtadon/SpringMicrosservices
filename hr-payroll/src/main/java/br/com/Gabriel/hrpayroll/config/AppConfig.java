package br.com.Gabriel.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

	@Bean
	public RestTemplate restTemplate() { //REGISTRAR UM SIGLETON (INSTANCIA UNICA) DE UM OBJETO RESTTEMPLATE. CRIAR COMPONENETE A APARTIR DE CHAMADA DE METODO
		return new RestTemplate(); //PARA INJETAR EM OUTROS SERVIÇOS
	}
	
}
