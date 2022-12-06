public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int loanAmount = 1000000;
        double loanRate = 9.99;
        double monthlyRate = loanRate / (100 * 12);
        int payment1 = service.calculate(12);
        int payment2 = service.calculate(24);
        int payment3 = service.calculate(36);

        System.out.println(payment1);
        System.out.println(payment2);
        System.out.println(payment3);

    }
}
