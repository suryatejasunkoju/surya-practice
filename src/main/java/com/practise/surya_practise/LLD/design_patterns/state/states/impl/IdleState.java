package com.practise.surya_practise.LLD.design_patterns.state.states.impl;

import com.practise.surya_practise.LLD.design_patterns.state.Coin;
import com.practise.surya_practise.LLD.design_patterns.state.Item;
import com.practise.surya_practise.LLD.design_patterns.state.product.VendingMachine;
import com.practise.surya_practise.LLD.design_patterns.state.states.State;


import java.util.ArrayList;
import java.util.List;

public class IdleState implements State {

    public IdleState() {
        System.out.println("Currently Vending machine is in IdleState");
    }

    public IdleState(VendingMachine machine) {
        System.out.println("Currently Vending machine is in IdleState");
        machine.setCoinList(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void clickOnProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("first you need to click on insert coin button");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("you can not insert coin in idle state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("you can not choose Product in idle state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("you can not get change in idle state");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNo)  throws Exception{
        throw new Exception("you can not get change in idle state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine)  throws Exception{
        throw new Exception("you can not get change in idle state");
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNo)  throws Exception{
        vendingMachine.getInventory().addItem(item, codeNo);
    }
}
