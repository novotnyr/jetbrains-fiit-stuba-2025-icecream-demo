package com.jetbrains.icecream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OpenMeteoServiceTest {
    @Test
    void openMeteoResponseIsRetrieved() {
        var openMeteo = new OpenMeteoService();
        var response = openMeteo.getCurrent();
        assertNotNull(response);
        assertNotNull(response.current);
    }
}