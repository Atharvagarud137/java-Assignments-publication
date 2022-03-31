import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        book b = new book();
        magazine m = new magazine();
        int outer;
        do {
            System.out.println("\n\n\tCHOOSE ONE OF THE FOLLOWING.....\n\n\t1.BOOK\t\t\t2.MAGAZINE"
                    + "\n\n\t3.TOTAL SALE AMOUNT\t4.REVENUE OF PUBLICATION\n\n");
            System.out.println("Choice:");
            int k = sc.nextInt();
            int a;
            aa: if (k == 1) {
                do {
                    int c;
                    System.out.println("\n\t\tMENU FOR BOOK\n");
                    System.out.println("\t1. Read Book\t\t2. Display\n\t3. Sale Copies\t\t4. Order Copies");
                    System.out.println("\n\tChoice:");
                    c = sc.nextInt();
                    switch (c) {
                        case 1:
                            b.read_book();
                            break;
                        case 2:
                            b.display_book();
                            break;
                        case 3:
                            System.out.println("HOW MANY COPIES YOU (the customer) WANT?");
                            int n1 = sc.nextInt();
                            b.sale_copy(n1);
                            break;
                        case 4:
                            System.out.println("ENTER COPIES WANT TO ORDER (for your shop)?");
                            int n2 = sc.nextInt();
                            b.order_copies(n2);
                            break;
                        default:
                            System.out.println("Invalid choice entered.");
                            break;
                    }
                    System.out.println(
                            "Do you want to continue with the book section [1/0]...Enter 1 for YES and 0 for NO");
                    System.out.println("\tChoice:");
                    a = sc.nextInt();
                    if (a == 0)
                        break aa;
                } while (a == 1);
            } else if (k == 2) {
                mm: do {
                    System.out.println(
                            "\n\t\tMENU FOR MAGAZINE...\n\t\t1. READ\t\t2. DISPLAY\n\t3. SALE MAGAZINE COPIES\t\t4. RECIEVE NEW ISSUE\n");
                    int d;
                    System.out.println("\n\tChoice:");
                    d = sc.nextInt();
                    switch (d) {
                        case 1:
                            m.read_mag();
                            break;
                        case 2:
                            m.display_mag();
                            break;
                        case 3:
                            System.out.println("HOW MANY COPIES YOU WANT (the customer)?");
                            int n3 = sc.nextInt();
                            m.sale_copy(n3);
                            break;
                        case 4:
                            System.out.println("ENTER THE NEW ISSUE DATE [dd/mm/yyyy]");
                            String date = sc.next();
                            m.recieve_issue(date);
                            break;
                    }
                    System.out.println(
                            "DO YOU WANT TO CONTINUE WITH MAGAZINE SECTION?....[1/0] Enter 1 for YES and 0 for NO");
                    System.out.println("Choice:");
                    a = sc.nextInt();
                    if (a == 0) {
                        break mm;
                    }
                } while (a == 1);
            } else if (k == 3) {
                System.out.println("\n\tTOTAL SALE AMOUNT IS (which is to be paid by the customer)= "
                        + (b.getTotal() + m.getTotal()) + " ");
            } else if (k == 4) {
                System.out.println("\n\tTOTAL REVENUE FOR PUBLICATION IS: "
                        + (b.getCopies() * b.getprice() + m.getCopies() * m.getprice()));
            } else {
                System.out.println("Invalid key...");
            }
            System.out.println("DO YOU WANT TO CONTINUE WITH PUBLICATION?\n\tEnter 1 to continue or 0 to terminate");
            outer = sc.nextInt();
        } while (outer != 0);
        sc.close();
    }
}