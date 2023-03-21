public class Ex02 {

    public static void main(String[] args) {
        String iban = "DE041234567123456789";

        String countryCode = iban.substring(0, 2);
        String checkDigit = iban.substring(2, 4);
        String bankCode = iban.substring(4, 11);
        String accountNumber = iban.substring(11, 20);

        System.out.println("IBAN: " + iban);
        System.out.println("Länderkürzel: " + countryCode);
        System.out.println("Prüfziffer: " + checkDigit);
        System.out.println("Bankleitzahl: " + bankCode);
        System.out.println("Kontonummer: " + accountNumber);
    }

}
