package com.tw.domain;

import java.util.Optional;

public class TodoItemRepository {
    private final ServiceConfiguration configuration;

    public TodoItemRepository(ServiceConfiguration configuration) {
        this.configuration = configuration;
    }

    public long create(String name) throws Exception {
        // TODO:
        //   Please implement the method.
        throw new RuntimeException("Delete me");
    }

    public boolean changeCheckedStatus(long id, boolean checked) throws Exception {
        // TODO:
        //   Please implement the method.
        throw new RuntimeException("Delete me");
    }

    public Optional<TodoItem> findById(long id) throws Exception {
        // TODO:
        //   Please implement the method.
        throw new RuntimeException("Delete me");
    }
}