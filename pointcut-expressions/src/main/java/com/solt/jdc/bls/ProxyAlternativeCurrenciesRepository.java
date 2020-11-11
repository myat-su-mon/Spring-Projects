package com.solt.jdc.bls;

public class ProxyAlternativeCurrenciesRepository extends AlternativeCurrenciesRepository{
    private AlternativeCurrenciesRepository alternativeCurrenciesRepository;

    public ProxyAlternativeCurrenciesRepository(AlternativeCurrenciesRepository alternativeCurrenciesRepository) {
        this.alternativeCurrenciesRepository = alternativeCurrenciesRepository;
    }

    @Override
    public int getCurrenciesCount() {
        System.out.println("Do Something extra......");
        return super.getCurrenciesCount();
    }
}
