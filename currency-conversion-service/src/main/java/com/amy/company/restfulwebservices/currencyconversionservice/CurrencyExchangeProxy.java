package com.amy.company.restfulwebservices.currencyconversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name="currency-exchange-service", url="localhost:8000") //without ribbon
//@FeignClient(name="currency-exchange-service") //Direct call
@FeignClient(name="netflix-zuul-api-gateway")	// Gateway to service
@RibbonClient(name="currency-exchange-service")
public interface CurrencyExchangeProxy {
	
	//@GetMapping("/currency-exchange/from/{from}/to/{to}")
	@GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean retrieveExchangeValue (@PathVariable String from, @PathVariable String to);
}
