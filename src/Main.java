public class Main {
    public static void main(String[] args) {
        int initialInvoiceAmount = 500;
        int replenishmentAmount = 1500;
        int invoiceTotal = replenishmentAmount + initialInvoiceAmount;
        int bonus = replenishmentAmount / 100;
        if (replenishmentAmount >= 1001) {
            System.out.println("На вашем счету : " + (invoiceTotal + bonus) + "  рубля(ей) ");
        } else {
            System.out.println("На вашем счету : " + invoiceTotal + "  рубля(ей)");
        }
        if (replenishmentAmount >= 1001) {
            System.out.println("Вы получили : " + bonus + " бонусных рубля(ей)");
        } else {
            System.out.println("Вы получили : " + 0 + " бонусных рубля(ей)");
        }
    }
}
