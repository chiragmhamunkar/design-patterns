package com.learn.patterns.behavioral.command;

import com.learn.patterns.behavioral.command.controller.LightController;
import com.learn.patterns.behavioral.command.receiver.Light;

public class CommandClient {
    public static void main(String[] args) {
        Light light = new Light();
        LightController remote = new LightController(light);

        remote.perform(Light.LightCommand.ON);
        remote.perform(Light.LightCommand.OFF);
    }
}
