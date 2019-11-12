package com.mix.contrast.action;

import java.util.ArrayList;

class CommandQueue {
    private ArrayList<Command> commands = new ArrayList<>();

    void addCommand(Command command) {
        this.commands.add(command);
    }

    void removeCommand(Command command) {
        this.commands.remove(command);
    }

    void execute() {
        for (Command command: commands) {
            command.execute();
        }
    }
}

class Invoker {
    private CommandQueue commandQueue;

    Invoker(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    void setCommandQueue(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    void call() {
        commandQueue.execute();
    }
}

/**
 * @author guobin211
 * @version 0.0.1
 * @date 2019-11-12  13:36
 */
public class CommandMain {
    public static void main(String[] args) {
        System.out.println("命令模式");
    }
}
