package smart.vince.template;

import minevalley.smart.api.*;
import smart.vince.template.module.listeners.PlayerInteractListener;

@Description(
        name = "Template",
        authors = "vince",
        version = "1.0",
        iconHead = "e5bf4db51fab4aa279628dfb2a1720e01bf7e9b94bb8c7e702fb63757405d"
)
public final class Template extends SmartApp {

    public Template(SmartServer server) {
        super(server);
    }

    // TODO: Rename package (author and module name)
    // TODO: Rename main-class
    // TODO: Rename module and project
    // TODO: Edit Description-annotation of main class
    // TODO: Update SmartAPI in pom.xml to newest version (https://github.com/MineValley/SmartAPI/packages/)
    // TODO: Rename Group-, ArtifactID and project name in pom.xml
    // TODO: Add artifact (Click on the module and press F4)

    @Override
    public void onEnable() {
        // SmartApp startup logic

        Smart.registerListeners(new PlayerInteractListener()); // Listener-registrations
    }

    @Override
    public void onDisable() {
        // SmartApp shutdown logic
    }

    @Override
    public void onSessionCreate(Session session) {
        // Session create logic
    }
}
