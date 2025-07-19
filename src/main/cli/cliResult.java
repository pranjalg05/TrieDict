package cli;

public class cliResult {
    public CommandType command;
    public String word;

    public cliResult(CommandType command, String word) {
        this.command = command;
        this.word = word;
    }

}
