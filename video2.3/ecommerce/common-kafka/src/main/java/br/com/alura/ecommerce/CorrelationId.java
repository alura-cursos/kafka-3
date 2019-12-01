package br.com.alura.ecommerce;

import java.util.UUID;

public class CorrelationId {

    private final String id;

    CorrelationId() {
        id = UUID.randomUUID().toString();
    }

    @Override
    public String toString() {
        return "CorrelationId{" +
                "id='" + id + '\'' +
                '}';
    }
}
