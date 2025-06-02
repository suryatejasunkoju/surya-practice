package com.practise.surya_practise.LLD.design_patterns.state;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Item {
    private ItemType type;
    private int price;

}
