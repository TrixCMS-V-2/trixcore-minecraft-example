# Example

This plugin is an example of how to create addons for the TrixCore plugin.

This version of the plugin uses the bukkit api, but the syntax used to declare and add methods is the same regardless of the support used: bungeecord, spigot, velocity, …

Note: it is not recommended to develop a plugin that supports several types of servers, but it is nevertheless possible.

# Creating a method

As you can see in the [ExampleMethod.java](https://github.com/TrixCMS-V-2/trixcore-minecraft-example/blob/master/src/main/java/eu/trixcms/trixcore/example/ExampleMethod.java) file, each method must respect certain rules which are :

- must implement the IMethod.java interface
- must have an annotation @MethodName
- the method name should not contain any special characters, if possible in lower case letters
- the exec function must return a (logical) response

The annotation MethodName is mandatory, the name is unique. As far as the answers are concerned you have several of them present. Feel free to add more. Nevertheless keep in mind that the answers will be transformed into json.

# Add a method

```java
TrixCore.getInstance()
   .getTrixServer()
   .registerMethod(new ExampleMethod());
```

I refer you back to [IServer.java](https://github.com/TrixCMS-V-2/trixcore-minecraft-api/blob/master/src/main/java/eu/trixcms/trixcore/api/server/IServer.java) to see the different functions you can use.

Note that to override a method already present you will have to call :

```java
TrixCore.getInstance()
   .getTrixServer()
   .overrideMethod("nom_methode", new NouvelleVersionMethod());
```
