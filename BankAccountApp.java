package bankaccapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
       List<Accounts>account=new LinkedList<Accounts>();

        //list commen properties for Saving and Checking Accounts
        String file = "C:\\Users\\Zoya Khan\\Desktop\\Java projects\\emailApp\\src\\bankaccapp\\resourses\\NewBankAccounts.CSV";



        //use constructor to set base properties and Initialize the Account
        /*Checking chkAcc1=new Checking("Zoyaa","231456789",1500);
        Savings svAcc1=new Savings("Aalima Quosar","456734901",2500);
        svAcc1.showInfo();
        svAcc1.Compound();
        System.out.println("*****************");
        chkAcc1.showInfo();
*/
        List <String[]>newAccountHolder=Utilities.CSV.read(file);
        for(String[] accountHolder:newAccountHolder){
           String name=accountHolder[0];
           String sSN=accountHolder[1];
           String accountType=accountHolder[2];
           double initDeposite=Double.parseDouble(accountHolder[3]);
           if(accountType.equals("Savings")){
            
            account.add(new Savings(name, sSN, initDeposite));
           }
           else if(accountType.equals("Checking")){
            
            account.add(new Checking(name, sSN, initDeposite));
           }else{
            System.out.println("ERROR! ACCOUNT TYPE IS NOT FOUND!");
           }
        }
        for(Accounts acc:account){
            System.out.println("\n*************************");
            acc.showInfo();
        }
        //list commen Methods like deposite(),withdrawl(),showInfo()
        
    }


}
