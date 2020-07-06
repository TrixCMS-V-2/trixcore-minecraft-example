package eu.trixcms.trixcore.example;

import eu.trixcms.trixcore.api.method.exception.DuplicateMethodNameException;
import eu.trixcms.trixcore.api.method.exception.InvalidMethodDefinitionException;
import eu.trixcms.trixcore.bukkit.TrixCore;
import org.bukkit.plugin.java.JavaPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Example extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getLogger().info("Hello from example plugin !");
        try {
            TrixCore.getInstance()
                    .getTrixServer()
                    .registerMethod(new ExampleMethod());
        } catch (DuplicateMethodNameException e) {
            this.getLogger().severe("Oops, the name for the method is already taken");
        } catch (InvalidMethodDefinitionException e) {
            this.getLogger().severe("Oops, I made a mistake :o");
        }
    }

    @Override
    public void onDisable() {
        this.getLogger().info("Bye");
    }
}
