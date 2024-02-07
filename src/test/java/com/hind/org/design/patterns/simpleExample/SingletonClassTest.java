package com.hind.org.design.patterns.simpleExample;

import static org.junit.jupiter.api.Assertions.assertSame;
import org.junit.jupiter.api.Test;

public class SingletonClassTest {

    @Test
    public void testGetInstance() {
        SingletonClass instance1 = SingletonClass.getInstance();
        SingletonClass instance2 = SingletonClass.getInstance();

        assertSame(instance1, instance2);
    }

}
