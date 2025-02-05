package bankaccapp;

public abstract class Accounts implements IBaseRank {
String name;
String sSN;
double balance;
protected String AccountNumber;
static int index=10000;
protected double rate;

    public Accounts(String name,String sSN,double initDeposite){
        this.name=name;
        this.sSN=sSN;
        this.balance=initDeposite;
        //set account number
        index++;
        this.AccountNumber=setAccount();
        setRate();
    }

    //List comment methods

    public void Compound(){
        double accrudeInterest=balance*(rate/100);
        balance=balance+accrudeInterest;
        System.out.println("Accrude Interest $"+accrudeInterest);
        printBalance();
    }

    public void deposite(int amount){
        balance=balance+amount;
        System.out.println("Depositing :"+amount);
        printBalance();

    }

    public void withdrawl(int amount){
        balance=balance-amount;
        System.out.println("Withdrawl :"+amount);
        printBalance();
    }
    public void tranfer(int amount,String toWhere){
     balance=balance+amount;
     System.out.println("Transfering $"+" "+amount+" "+"to"+toWhere);
     printBalance();
    }


    public void printBalance(){
        System.out.println("Your Balance is now :"+balance);

    }
    public abstract void setRate();

    private String setAccount(){
        String lastTwoOfSsn=sSN.substring(sSN.length()-2,sSN.length());
        int uniqueId=index;
        int randomNumber=(int)Math.floor(Math.random()*100);
        return lastTwoOfSsn + uniqueId +randomNumber;
    }

    public void showInfo(){
        System.out.println(
            "Name :"+name+
            "\nAccount Number :"+AccountNumber+
            "\nBalance :"+balance+
            "\nRate :"+rate + "%"
        );
    }
}
