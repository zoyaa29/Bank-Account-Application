package bankaccapp;

public interface IBaseRank {


    //write methods to return base rate
    default double getBase(){
        return 2.5;
    }

}
