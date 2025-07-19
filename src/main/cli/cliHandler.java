package cli;

public class cliHandler {

    public static cliResult parse(String line){

        if(line.equals("exit")){
            return new cliResult(CommandType.EXIT, null);
        }
        if(line.startsWith("search")){
            if(line.length()<8) return new cliResult(CommandType.NO_ARGS, null);
            else return new cliResult(CommandType.SEARCH, line.substring(7).trim());
        } else if (line.startsWith("suggest")) {
            if(line.length()<9) return new cliResult(CommandType.NO_ARGS, null);
            else return new cliResult(CommandType.SUGGEST, line.substring(8).trim());
        }
        else return new cliResult(CommandType.INVALID, null);
    }
}
