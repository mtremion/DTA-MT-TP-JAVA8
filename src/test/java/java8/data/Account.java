package java8.data;

public class Account {

    private Person owner;
    private Integer balance;
    
    public Account()
    {
    	this.owner = null;
    	this.balance = null;
    }
    
    public Account(Person pPerson, Integer pBalance)
    {
    	this.owner = pPerson;
    	this.balance = pBalance;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}
