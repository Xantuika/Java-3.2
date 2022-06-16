public class Main {
    public static void main(String[] args) {
        int initialInvoiceAmount = 500;
        int a = initialInvoiceAmount;
        int replenishmentAmount = 1500;
        int b = replenishmentAmount;
        int invoiceTotal = b + a;
        int c = invoiceTotal;
        int bonus = b / 100;
        int d = bonus;
        if (b >= 1001) {
            System.out.println("На вашем счету : " + (c + d) + "  рубля(ей) ");
        } else {
            System.out.println("На вашем счету : " + c + "  рубля(ей)");
        }
        if (b >= 1001) {
            System.out.println("Вы получили : " + d + " бонусных рубля(ей)");
        } else {
            System.out.println("Вы получили : " + 0 + " бонусных рубля(ей)");
        }


    }
}

