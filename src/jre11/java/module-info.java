import com.jwebmp.plugins.simplebar.SimpleBarPageConfigurator;

module com.jwebmp.plugins.simplebar {
    requires transitive com.jwebmp.core;

    provides com.jwebmp.core.services.IPageConfigurator with SimpleBarPageConfigurator;

    opens com.jwebmp.plugins.simplebar to com.google.guice;
}
