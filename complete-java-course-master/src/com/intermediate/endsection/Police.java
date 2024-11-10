package com.intermediate.endsection;

public class Police {
    public boolean areCriminalsCaught(){
        int rPolice = (int) (Math.random() * (100 - 0)) + 0;
        if(rPolice >= Criminal.getSuccessPercentage()){
            return false;
        }else{
            return true;
        }
    }
}
