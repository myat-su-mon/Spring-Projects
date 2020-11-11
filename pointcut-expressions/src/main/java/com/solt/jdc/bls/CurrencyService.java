package com.solt.jdc.bls;

import com.solt.jdc.annotation.InTransaction;
import com.solt.jdc.annotation.Secured;
import com.solt.jdc.annotation.Validated;
import com.solt.jdc.ds.CurrencyId;
import org.springframework.stereotype.Component;

@Component("currency_service")
@Secured
public class CurrencyService {
    @InTransaction
    public float getExchangeRate(String from, String to ){
        //System.out.println("Get Exchange Rate with 2 parameters");
        return 0F;
    }

    public float getExchangeRate(String from, String to, int multiplier){
        //System.out.println("Get Exchange Rate with 3 parameters");
        return 0F;
    }

    public String getCurrencyLongName(@Validated CurrencyId currencyId){
        return null;
    }

    public String getCurrencyCountryName(CurrencyId currencyId){
        if (currencyId == CurrencyId.USD){
            return "USA";
        }else {
            throw new IllegalArgumentException("test");
        }
    }

}
