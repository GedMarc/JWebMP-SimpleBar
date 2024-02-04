import com.jwebmp.plugins.simplebar.SimpleBarInclusionModule;
import com.jwebmp.plugins.simplebar.SimpleBarPageConfigurator;

module com.jwebmp.plugins.simplebar {
    requires transitive com.jwebmp.core.angular;

    provides com.jwebmp.core.services.IPageConfigurator with SimpleBarPageConfigurator;
    provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with SimpleBarInclusionModule;
    
    opens com.jwebmp.plugins.simplebar to com.google.guice;
}
