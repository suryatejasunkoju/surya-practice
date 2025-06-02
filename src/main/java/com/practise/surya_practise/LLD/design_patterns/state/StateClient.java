package com.practise.surya_practise.LLD.design_patterns.state;

import com.practise.surya_practise.LLD.design_patterns.state.product.VendingMachine;
import com.practise.surya_practise.LLD.design_patterns.state.states.State;

public class StateClient
{
    public static void run()
    {
        //vending machine:
        //happy flow:
        // 1st machine state:idle
        //user wants soda(code:106)
        //user clicked "insert cash button"
        // 2nd machine state:has money
        //user can insert multiple coins repeatedly
        //3rd machine state:has money
        //user clicked "select product button"
        //user entered (106) soda code
        //4th machine state:selection product
        //user entered (101) coke code[changed his mind to take coke]
        //5th machine state:selection product

        //from 2nd state, we can click "cancel & refund" button which makes machine to go into idle state.
        //from 5th state, we can click "cancel & refund"(in case of insufficient money given) button which makes machine to go into idle state.
        //from 5th state, if money is sufficient, machine will go into "dispense product" state and then machine to go into idle state after dispensing the product.

        //from each state, we have set of defined actions that can be performed and machine will move to their corresponding states.

        //Example which has state wise operations will fall into state design pattern.
        //Design TV:
        //state, possible operations:
        // off,  turn on,
        // on,   change channel, change volume, turn off

        //In state design pattern, we will have state interface which will have all methods representing all actions.
        //Each state class  will implement this interface and provide its own implementation of the methods that only it(current state) can perform. For all other methods either default implementation will be provided or exception will be thrown.
        //Product will have state, ie., private State state; inside Product. In each state class, we will have a reference to the product so that we can perform action on that product.





        VendingMachine vendingMachine = new VendingMachine();
        try {
            System.out.println("Filling up the inventory");
//            vendingMachine.fillUpInventory();
            displayInventory(vendingMachine);

            System.out.println("\nClicking on Insert Coin Button");
            State vendingState = vendingMachine.getVendingMachineState();
            vendingState.clickOnInsertCoinButton(vendingMachine);
            State state = vendingMachine.getVendingMachineState();
            state.insertCoin(vendingMachine, Coin.NICKEL);
            state.insertCoin(vendingMachine, Coin.DIME);
            state.insertCoin(vendingMachine, Coin.QUARTER);
            // vendingState.insertCoin(vendingMachine, Coin.PENNY);

            System.out.println("\nClicking on Product Selection Button");
            vendingState = vendingMachine.getVendingMachineState();
            vendingState.clickOnProductSelectionButton(vendingMachine);
            vendingState.chooseProduct(vendingMachine, 102);

            displayInventory(vendingMachine);
        }
        catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
            displayInventory(vendingMachine);
        }
    }


    private static void fillUpInventory(VendingMachine vendingMachine) {
        ItemShelf[] slots = vendingMachine.getInventory().getInventory();
        for (int i = 0; i < slots.length; i++) {
            Item newItem;
            if (i >= 0 && i < 3) {
                newItem = new Item(ItemType.COKE, 12);
            } else if (i >= 3 && i < 6) {
                newItem = new Item(ItemType.PEPSI, 15);
            } else if (i >= 6 && i < 9) {
                newItem = new Item(ItemType.JUICE, 13);
            } else {
                newItem = new Item(ItemType.SODA, 16);
            }
            slots[i].setItem(newItem);
            slots[i].setSoldOut(false);
        }
    }

    private static void displayInventory(VendingMachine vendingMachine) {
        ItemShelf[] slots = vendingMachine.getInventory().getInventory();
        for (int i = 0; i < slots.length; i++) {
            System.out.println("CodeNumber: " + slots[i].getCode() +
                    ", Item: " + slots[i].getItem().getType().name() +
                    ", Price: " + slots[i].getItem().getPrice() +
                    ", isSoldOut: " + slots[i].isSoldOut());
        }
    }
}
