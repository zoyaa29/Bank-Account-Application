package bankaccapp;

public class Savings extends Accounts {


    //list properties for specific saving account
private int safetyDepositeBoxId;
private int safetyDepositeKey;



    //constructor to initialize the setting for saving
    public Savings(String name,String sSN,double initDeposite){
        super(name,sSN,initDeposite);
        //1 for savings
        AccountNumber="1"+AccountNumber;
        setSafetyDepositeId();
    }


    //specific methods for savings
    @Override
    public void setRate(){
        rate=getBase()- .25;
    }

    private void setSafetyDepositeId(){
        safetyDepositeBoxId=(int)Math.floor(Math.random()*1000);
        safetyDepositeKey=(int)Math.floor(Math.random()*10000);
    }
    public void showInfo(){
       
        super.showInfo();
        System.out.println("Your Savings Account Features :"+
        "\nSafety Deposite Box Id :"+safetyDepositeBoxId+
        "\nSafety Deposite Key :"+safetyDepositeKey
        
        );
        
    }

}
