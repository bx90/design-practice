package behavioral.command;

public class TurnOnCommand implements Command {

    //Composition, injected from outside.
    private Light light;

    public TurnOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
