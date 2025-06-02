package com.practise.surya_practise.LLD.design_patterns.state.product;

import com.practise.surya_practise.LLD.design_patterns.state.Coin;
import com.practise.surya_practise.LLD.design_patterns.state.Inventory;
import com.practise.surya_practise.LLD.design_patterns.state.Item;
import com.practise.surya_practise.LLD.design_patterns.state.states.State;
import com.practise.surya_practise.LLD.design_patterns.state.states.impl.IdleState;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class VendingMachine {

    private State vendingMachineState;
    private Inventory inventory;
    private List<Coin> coinList;

    public VendingMachine() {
        vendingMachineState = new IdleState();
        inventory = new Inventory(10);
        coinList = new ArrayList<>();
    }

    public State getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(State vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Map<Integer, Item> inventory) {
//        this.inventory.setInventory(inventory);
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }
}
