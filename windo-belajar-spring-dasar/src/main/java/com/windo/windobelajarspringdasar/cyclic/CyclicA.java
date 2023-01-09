/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.windo.windobelajarspringdasar.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author ASUS
 */
@Data
@AllArgsConstructor
public class CyclicA {
    
    private CyclicB cyclicB;
}
