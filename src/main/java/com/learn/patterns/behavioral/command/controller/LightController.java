package com.learn.patterns.behavioral.command.controller;

import com.learn.patterns.behavioral.command.commands.Command;
import lombok.Getter;
import lombok.Setter;

public class LightController {
    @Getter
    @Setter
    private Command command;

    public void pressButton(){
        command.execute();
    }
}
