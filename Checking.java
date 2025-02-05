package bankaccapp;

public class Checking extends Accounts{

    //list properties about checking account like debit card, 4digit puin
private int debitCardNumber;
private int debitCardPin;

    //constructor to initialise checking account property
    public Checking(String name,String sSN,double initDeposite){
        super(name,sSN,initDeposite);

        //2 for checking
        AccountNumber="2"+AccountNumber;
        
       setDebit();
    }
    

    //list any method specific to the checking account

    @Override
    public void setRate(){
        rate=getBase()*.15;
    }

    private void setDebit(){
        debitCardNumber=(int)(Math.random()*Math.pow(10,12));
        debitCardPin=(int)(Math.random()*Math.pow(10, 4));
    }
    public void showInfo(){
        
        super.showInfo();
        System.out.println("Your Checking Account Features :"+
        "\nDebit Card Number :"+debitCardNumber+
        "\nDebit Card Pin :"+debitCardPin
        );
    }

}
