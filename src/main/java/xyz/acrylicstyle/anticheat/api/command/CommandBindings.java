package xyz.acrylicstyle.anticheat.api.command;

import org.bukkit.command.CommandExecutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import util.StringCollection;

import java.util.function.BiConsumer;
import java.util.function.Function;

public class CommandBindings {
    private final StringCollection<CommandExecutor> commands = new StringCollection<>();

    public void addCommand(@NotNull String commandKey, @NotNull CommandExecutor command) {
        commands.add(commandKey, command);
    }

    @Nullable
    public CommandExecutor getCommand(@NotNull String command) {
        return commands.get(command);
    }

    public void forEach(@NotNull BiConsumer<String, CommandExecutor> consumer) {
        commands.forEach(consumer);
    }

    @NotNull
    public StringCollection<CommandExecutor> filterKeys(@NotNull Function<String, Boolean> function) {
        return commands.filterKeys(function);
    }

    @NotNull
    public StringCollection<CommandExecutor> getCommands() { return this.commands; }

    public void clear() { this.commands.clear(); }
}
