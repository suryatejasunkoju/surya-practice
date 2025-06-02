package com.practise.surya_practise.LLD.design_patterns.state;

import lombok.Data;

@Data
public class ItemShelf {
    int code;
    Item item;
    boolean soldOut;
}
