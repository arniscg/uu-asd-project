package src;
package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Hashmap;

enum Currency {
    SEK,
    EUR
}

class PaymentDetails {
    CreditCard credit_card;
    int destination_iban;
    Currency currency;
    int amount;

}

class CreditCard {
    String card_number;
    String cvc;
    int expiration_month;
    int expiration_day;


    public CreditCard(String card_number, String cvc, int expiration_month, int expiration_day) {};

    public getCardInfo():
        Dictionary card_info = new Hashmap();
        card_info.put('card_number': card_number);
        card_info.put('cvc': cvc);
        card_info.put('exp_month': expiration_month);
        card_info.put('exp_day': expiration_day);
        return card_info
}

class ThirdPartyPaymentSystems {
    public ThirdPartyPaymentSystems() {}
}
