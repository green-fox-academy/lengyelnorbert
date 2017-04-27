package entity;

public class RunOption implements Entity{

  private final String command;

  public String getCommand() {
    return command;
  }

  public String getArgument() {
    return argument;
  }

  public String getDescription() {
    return description;
  }

  private final String argument;
  private final String description;

  public RunOption(String command, String argument, String description) {
    this.command = command;
    this.argument = argument;
    this.description = description;
  }

  @Override
  public String toDataFormat() {
    return String.format("%s;%s;%s", command, argument, description);
  }
}
