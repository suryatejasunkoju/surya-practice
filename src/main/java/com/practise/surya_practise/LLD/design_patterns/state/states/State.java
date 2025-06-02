package com.practise.surya_practise.LLD.design_patterns.state.states;

import com.practise.surya_practise.LLD.design_patterns.state.Coin;
import com.practise.surya_practise.LLD.design_patterns.state.Item;
import com.practise.surya_practise.LLD.design_patterns.state.product.VendingMachine;

import java.util.List;

public interface State
{
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception;
    public void clickOnProductSelectionButton(VendingMachine vendingMachine) throws Exception;
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception;
    public void chooseProduct(VendingMachine vendingMachine, int codeNo) throws Exception;
    public int getChange(int returnChangeMoney) throws Exception;
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNo) throws Exception;
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception;
    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNo) throws Exception;
}
