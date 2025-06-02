package com.practise.surya_practise.LLD.design_patterns.state.states.impl;

import com.practise.surya_practise.LLD.design_patterns.state.Coin;
import com.practise.surya_practise.LLD.design_patterns.state.Item;
import com.practise.surya_practise.LLD.design_patterns.state.product.VendingMachine;
import com.practise.surya_practise.LLD.design_patterns.state.states.State;

import java.util.List;

public class SelectionState implements State {
    public SelectionState() {
        System.out.println("Currently Vending machine is in SelectionState");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("you can not click on insert coin button in Selection state");
    }

    @Override
    public void clickOnProductSelectionButton(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("you can not insert Coin in selection state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        // 1. get item of this codeNumber
//        Item item = machine.getInventory().getItem(codeNumber);
//
//        // 2. total amount paid by User
//        int paidByUser = 0;
//        for (Coin coin : machine.getCoinList()) {
//            paidByUser = paidByUser + coin.value;
//        }
//
//        // 3. compare product price and amount paid by user
//        if (paidByUser < item.getPrice()) {
//            System.out.println("Insufficient Amount, Product you selected is for price: "
//                    + item.getPrice() + " and you paid: " + paidByUser);
//            refundFullMoney(machine);
//            throw new Exception("insufficient amount");
//        }        else if (paidByUser > item.getPrice()) {
//            // return extra change
//            getChange(paidByUser - item.getPrice());
//        }

        // go to DispenseState
        machine.setVendingMachineState(new DispenseState(machine, codeNumber));
    }

    @Override
    public int getChange(int returnExtraMoney) throws Exception {
        // actual logic should be to return COINS in the dispense tray,
        // but for simplicity I am just returning the amount to be refunded
        System.out.println("Returned the change in the Coin Dispense Tray: " + returnExtraMoney);
        return returnExtraMoney;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoinList();
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("product can not be dispensed in Selection state");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("Inventory can not be updated in Selection state");
    }
}
