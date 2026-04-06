package br.com.main.transportes;

import org.junit.Test;
import static org.junit.Assert.*;

public class TesteFalha {

    @Test
    public void testeQueFalha() {
        assertEquals(1, 2); // vai dar erro de propósito
    }
}