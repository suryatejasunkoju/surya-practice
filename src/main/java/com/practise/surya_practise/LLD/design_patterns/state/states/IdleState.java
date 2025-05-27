package com.practise.surya_practise.LLD.design_patterns.state.states;

import com.practise.surya_practise.LLD.design_patterns.state.product.VendingMachine;

public class IdleState implements State{
    @Override
    public void clickOnInsertCoin(VendingMachine vendingMachine) throws Exception {

    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) {

    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {

    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNo) {

    }

    @Override
    public int getChange(int returnChangeMoney) {
        return 0;
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNo) {
        return null;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) {
        return null;
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNo) {

    }
}
