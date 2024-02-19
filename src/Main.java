import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("SALAMATSYZBY!!! YNTYMAK BANKYNA KOSH KELINIZ😊");
        Account account = new Account();
        Scanner scanner = new Scanner(System.in);

        int cod = 1111;

        System.out.println("Pin kod jazynyz: ");
        int s = scanner.nextInt();
        if (s != cod) {
            System.out.println("Pin kod tuura emes!");

        } else if (cod == s) {


            while (true) {
                System.out.println("""
                        0.Stop
                        1.Balansty teksheruu.
                        2.Balansty toluktoo.
                        3.Naktalai akcha chygaruu.
                        4.Akcha kotoruu.
                        """);


                switch (scanner.nextInt()) {
                    case 0 -> {
                        return;
                    }
                    case 1 -> {
                        System.out.print("My balance: ");
                        account.getBalances();
                        System.out.println();
                    }
                    case 2 -> {
                        System.out.println("Enter the amount to top up the balance: ");
                        double san = scanner.nextDouble();
                        account.balances = account.addBalances(account.balances, san);
                        System.out.println("My balance " + san + " added to the displayed amount!");
                    }
                    case 3 -> {
                        System.out.print("Enter the deductible amount: ");
                        double sum = scanner.nextInt();
                        account.withdrawMoney(sum);
                        System.out.print("Your balance after withdrawal: ");
                        account.getBalances();
                    }
                    case 4 -> {

                        System.out.print("Who do you translate for? Write the name and surname: " + scanner.nextLine());
                        switch (scanner.nextLine()) {
                            case "AzamatAzimovich" -> {
                                System.out.print("Write the amount: ");
                                double summa = scanner.nextDouble();
                                account.transaction(summa);
                                System.out.print("The transaction was completed successfully! \n");
                            }
                            case "DonaldTrump" -> {
                                System.out.print("Write the amount: ");
                                double summa2 = scanner.nextDouble();
                                account.transaction(summa2);
                                System.out.print("The transaction was completed successfully! \n");
                            }

                        }


                    }

                }
            }

        }
    }
}







