package com.learn.patterns.behavioral.command.controller;

import com.learn.patterns.behavioral.command.commands.Command;
import com.learn.patterns.behavioral.command.commands.LightOffCommand;
import com.learn.patterns.behavioral.command.commands.LightOnCommand;
import com.learn.patterns.behavioral.command.receiver.Light;

import java.util.Map;
import java.util.Objects;

public class LightController {

    private Command command;

    private Light light;

    private Map<Light.LightCommand, Command> commandsMap;
    public LightController(Light light){
        this.light = light;
        this.commandsMap = Map.of(
                Light.LightCommand.ON, new LightOnCommand(light),
                Light.LightCommand.OFF, new LightOffCommand(light)
                );
    }

    public void perform(Light.LightCommand lightCommand){
        Objects.requireNonNull(lightCommand, "command can not be null");
        commandsMap.get(lightCommand).execute();
    }
}
