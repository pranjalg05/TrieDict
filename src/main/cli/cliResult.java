package cli;

import java.util.HashSet;
import java.util.List;

public class cliResult {

    public CommandType command;
    public HashSet<String> unknowns;
    public String query;

    public cliResult(CommandType command, HashSet<String> unknowns, String query) {
        this.command = command;
        this.unknowns = unknowns;
        this.query = query;
    }
}
