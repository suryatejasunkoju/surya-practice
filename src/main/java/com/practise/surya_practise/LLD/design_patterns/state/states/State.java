package com.practise.surya_practise.LLD.design_patterns.state.states;

import com.practise.surya_practise.LLD.design_patterns.state.product.VendingMachine;

public interface State
{
    void clickOnInsertCoin(VendingMachine vendingMachine) throws Exception;
    void clickOnStartProductSelectionButton(VendingMachine vendingMachine);
    public void insertCoin(VendingMachine vendingMachine, Coin coin);
    public void chooseProduct(VendingMachine vendingMachine, int codeNo);
    public int getChange(int returnChangeMoney);
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNo);
    public List<Coin> refundFullMoney(VendingMachine vendingMachine);
    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNo);
}
