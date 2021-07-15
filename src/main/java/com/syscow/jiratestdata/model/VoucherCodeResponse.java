package com.syscow.jiratestdata.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VoucherCodeResponse {
    private String noPaymentNewAccMonthly;
    private String noPaymentNewAccAnnual;
    private String noPaymentExistingAcc;
    private String monthlyNewAcc;
    private String monthlyExistingAcc;
    private String annualNewAcc;
    private String annualExistingAcc;
    private String airportPromoNewAcc;
    private String airportPromoExistingAcc;
    private String airportPromoUrl;
    private String invalid;
}
