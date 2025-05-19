package com.practise.surya_practise.LLD.design_patterns.chain_of_responsibility.atm.concrete_handler;

public interface Handler
{
//    boolean handleRequest(int amount);
    int getDenominationQuantity();
    void setDenominationQuantity(int denominationQuantity);
    int getDenominationValue();

    default int handleRequest(int amount)
    {
        int denominationValue = getDenominationValue();
        int denominationQuantity = getDenominationQuantity();
        System.out.println("amount=" + amount);

        if(amount<denominationValue*denominationQuantity)
        {
            return -1;
        }
        else if(
                amount>=denominationValue*denominationQuantity
                        &&
                amount%denominationValue==0
        ){
            //subtract the denomination quantity
            setDenominationQuantity(denominationQuantity-amount/denominationValue);
            return amount-denominationValue*denominationQuantity;
        }
        else
        {
            //current handler cannot handle the request
            return -1;
        }
    }
}
