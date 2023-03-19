package terminal.animalsExecutable;

import terminal.commandExecutable.CommandExecutable;
import zoo.Zoo;

public class DeleteWolfExecutable implements CommandExecutable {
    private Zoo zoo;

    public DeleteWolfExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    public void execute() {
        zoo.deleteWolf();
    }
}