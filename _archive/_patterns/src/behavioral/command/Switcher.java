package behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Invoker
 */
public class Switcher {

    public List<Command> commandList;

    public Switcher() {
        commandList = new ArrayList<>();
    }

    public void addCommand(Command command) {
        this.commandList.add(command);
    }

    // Loose coupled. The function doesn't know the
    // implementation of the specific command.
    public void executeCommands() {
        commandList.forEach(Command::execute);
    }
}
