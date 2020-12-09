package com.learn.patterns.behavioral.command;

import com.learn.patterns.behavioral.command.commands.Command;
import com.learn.patterns.behavioral.command.commands.LightOffCommand;
import com.learn.patterns.behavioral.command.commands.LightOnCommand;
import com.learn.patterns.behavioral.command.controller.LightController;
import com.learn.patterns.behavioral.command.receiver.Light;

public class CommandClient {
    public static void main(String[] args) {
        LightController remote = new LightController();
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        remote.setCommand(lightOnCommand);
        remote.pressButton();

        Command lightOffCommand = new LightOffCommand(light);
        remote.setCommand(lightOffCommand);
        remote.pressButton();
    }
}
