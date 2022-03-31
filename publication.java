import java.util.Scanner;

class publication {
    private String title;
    private int price;
    private int copies;
    private int total;

    Scanner sc = new Scanner(System.in);

    public void settitle(String title) {
        this.title = title;
    }

    public void setcopies(int copies) {
        this.copies = copies;
    }

    public String gettitle() {
        return title;
    }

    public int getTotal() {
        return total;
    }

    public int getCopies() {
        return copies;
    }

    public int getprice() {
        return price;
    }

    void read_publ() {
        System.out.print("Enter Title:");
        title = sc.next();
        System.out.print("Enter price:");
        price = sc.nextInt();
        System.out.print("Enter copies:");
        copies = sc.nextInt();
    }

    void display() {
        System.out.print(title + "\t" + price + "\t" + copies);
    }

    void sale_copy(int number) {
        if (number <= copies) {
            copies = copies - number;
            total = total + number * price;
            System.out.println("\tYOU PURCHASED " + number + " COPIES\n\tYOU HAVE TO PAY:" + (price * number));
        } else {
            System.out.println(" INSUFFICIENT STOCK!!!!!!!!");
        }
    }
}

class book extends publication {
    private String author;

    void order_copies(int number) {
        int x = getCopies() + number;
        setcopies(getCopies() + number);
        System.out.println("\n\tORDER SUCCESSFULL....");
        System.out.println("\tCOPIES AVAILABLE: " + x);
    }

    void read_book() {
        read_publ();
        System.out.print("Enter the author of the book:");
        author = sc.next();
    }

    void display_book() {
        System.out.println("Title\tPrice\tCopy\tAuthor");
        display();
        System.out.println("\t" + author);
    }
}

class magazine extends publication {
    private int order_qty;
    private String issue_date;

    void recieve_issue(String new_issue_date) {
        System.out.println("ENTER THE AMOUNT OF NEW COPIES ORDERED:");
        order_qty = sc.nextInt();
        setcopies(order_qty);
        issue_date = new_issue_date;
        System.out.println("\tTHE MAGAZINE " + gettitle() + "\n\tWITH ISSUE DATE " + issue_date + " AVAILABLE");
    }

    void read_mag() {
        read_publ();
        System.out.println("Enter the Current Issue Date[dd/mm/yyyy]");
        issue_date = sc.next();
    }

    void display_mag() {
        System.out.println("Title\tPrice\tCopy\tDate");
        display();
        System.out.println("\t" + issue_date);
    }
}