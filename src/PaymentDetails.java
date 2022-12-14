package src;

public class PaymentDetails {
    CreditCard creditCard;
    int destinationIban;
    Currencty currency;
    float amount;

    public PaymentDetails(CreditCard creditCard, int destinationIban, Currencty currency, float amount) {}
    public CreditCard getCard() { return creditCard; }
    public int getDestination() { return destinationIban; }
    public Currencty getCurrency() { return currency; }
    public float getAmount() { return amount; }
}

class CreditCard {
    int cardNumber;
    int cvc;
    int expirationMonth;
    int expirationYear;

    public int[] getCardInfo() {
        int[] info = new int[4];
        info[0] = cardNumber;
        info[1] = cvc;
        info[2] = expirationMonth;
        info[3] = expirationYear;
        return info;
    }
}

enum Currencty {
    SEK,
    EUR
}