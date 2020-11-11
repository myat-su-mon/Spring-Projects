package com.solt.jdc;

import com.solt.jdc.bls.AlternativeCurrenciesRepository;
import com.solt.jdc.bls.CurrenciesRepository;
import com.solt.jdc.bls.CurrencyService;
import com.solt.jdc.ds.CurrencyId;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunnerMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();

        CurrenciesRepository currenciesRepository = context.getBean(CurrenciesRepository.class);
        AlternativeCurrenciesRepository alternativeCurrenciesRepository = context.getBean(AlternativeCurrenciesRepository.class);
        CurrencyService currencyService = context.getBean(CurrencyService.class);

        currenciesRepository.getCurrenciesCount();
        alternativeCurrenciesRepository.getCurrenciesCount();
        currencyService.getExchangeRate("EUR", "USD");
        currencyService.getExchangeRate("EUR", "USD", 100);
        currencyService.getCurrencyLongName(CurrencyId.EUR);
        try {
            currencyService.getCurrencyCountryName(CurrencyId.USD);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
