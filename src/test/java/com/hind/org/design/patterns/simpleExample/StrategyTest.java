// StrategyTest.java
package com.hind.org.design.patterns.simpleExample;

import org.junit.jupiter.api.Test;

public class StrategyTest {

    @Test
    public void testConcreteStrategyA() {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyA());
        context.executeStrategy(); 
    }

    @Test
    public void testConcreteStrategyB() {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyB());
        context.executeStrategy(); 
    }
}
