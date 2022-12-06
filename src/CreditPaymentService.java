public class CreditPaymentService {

    public static int calculate(int loanTerm) {
        int loanAmount = 1000000;
        double loanRate = 9.99;
        double monthlyRate = loanRate / (100 * 12);
        double power = 1 / (Math.pow(1 + monthlyRate,loanTerm));
        return (int) (loanAmount * (monthlyRate / (1 - power)));
    }
}
