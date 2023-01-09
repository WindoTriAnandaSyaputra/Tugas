/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.windo.windobelajarspringdasar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author ASUS
 */
public class ApplicationContextTest {
    @Test
    void testApplicationContext(){
        ApplicationContext context = new AnnotationConfigApplicationContext(WindoConfiguration.class);
        
        Assertions.assertNotNull(context);
    }
}