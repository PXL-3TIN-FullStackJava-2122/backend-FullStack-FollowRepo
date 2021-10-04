package be.pxl.service.proxy.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;

import org.springframework.context.annotation.Configuration;


@Configuration
public class ProxyApi {

	@Autowired
	ZuulProperties properties;

//	@Primary
//	@Bean
//	public SwaggerResourcesProvider swaggerResourcesProvider() {
//		return () -> {
//			List<SwaggerResource> resources = new ArrayList<>();
//			properties.getRoutes().values().stream()
//					.forEach(route -> resources.add(createResource(route.getServiceId(), route.getId(), "2.0")));
//			return resources;
//		};
//	}
//
//	private SwaggerResource createResource(String name, String location, String version) {
//		SwaggerResource swaggerResource = new SwaggerResource();
//		swaggerResource.setName(name);
//		swaggerResource.setLocation("/" + location + "/v2/api-docs");
//		swaggerResource.setSwaggerVersion(version);
//		return swaggerResource;
//	}

}
