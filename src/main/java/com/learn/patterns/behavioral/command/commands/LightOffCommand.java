package com.learn.patterns.behavioral.command.commands;

import com.learn.patterns.behavioral.command.receiver.Light;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOff();
    }
}