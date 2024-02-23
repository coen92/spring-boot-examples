package com.coen92.ddd.aggregate.command;

public interface CommandHandler<T extends Command> {
    void handle(T command);
}

