 
package org.eclipsercp.e4.hyperbola;

import javax.annotation.PostConstruct;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipsercp.e4.hyperbola.model.provider.ModelItemProviderAdapterFactory;

public class AdapterFactoryAddon {
	
	@PostConstruct
	void addAdapterFactory(IEclipseContext context) {
		context.set(AdapterFactory.class, new ModelItemProviderAdapterFactory());
	}
	
}