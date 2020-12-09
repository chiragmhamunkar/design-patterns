package com.learn.patterns.behavioral.command.commands;

import com.learn.patterns.behavioral.command.receiver.Light;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOn();
    }
}
