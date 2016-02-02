package adapter;

public class PaymentScript {
    public static void main(String[] args) {
        Xpay xpay = new XpayImpl();

        xpay.setCustomerName("Johnny Briggs");
        xpay.setCreditCardNo("123456678");
        xpay.setCardExpMonth("March");
        xpay.setCardExpYear("2019");
        xpay.setCardCVVNo((short)123);
        xpay.setAmount(123.45);

        XpayToPayDAdapter adapter = new XpayToPayDAdapter(xpay);

        System.out.println(adapter.getCardOwnerName());
        System.out.println(adapter.getCustCardNo());
        System.out.println(adapter.getCardExpMonthDate());
        System.out.println(adapter.getCVVNo());
        System.out.println(adapter.getTotalAmount());
    }
}
