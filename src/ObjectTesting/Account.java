package ObjectTesting;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int i) {
        return (balance+=i);
    }

    public int debit(int i) {
        if (balance > i) {
            return (balance -= i);
        } else {
            System.out.println("fattig lol");
            return balance;
        }
    }

    public int transferTo(Account namn ,int i) {
        if (balance > i) {
            namn.balance += i;
            return (balance -= i);
        } else {
            System.out.println("fattig lol");
            return balance;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
