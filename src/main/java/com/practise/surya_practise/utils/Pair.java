package com.practise.surya_practise.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
@NoArgsConstructor
public class Pair <T>
{
    private T key;
    private T value;

    public Pair(T key, T value) {
        this.key=key;
        this.value=value;
    }

    //Pair(time,space) complexities
    public static <T> Pair of(T key, T value){
        return new Pair<>(key, value);
    }
}
