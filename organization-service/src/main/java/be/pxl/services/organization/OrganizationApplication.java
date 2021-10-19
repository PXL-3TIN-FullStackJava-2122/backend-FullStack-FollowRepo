package be.pxl.services.organization;

import be.pxl.services.organization.model.Organization;
import be.pxl.services.organization.repository.OrganizationRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrganizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrganizationApplication.class, args);
	}
//
//	@Bean
//	public Docket swaggerApi() {
//		return new Docket(DocumentationType.SWAGGER_2)
//				.select()
//					.apis(RequestHandlerSelectors.basePackage("be.pxl.services.organization.controller"))
//					.paths(PathSelectors.any())
//				.build()
//				.apiInfo(new ApiInfoBuilder().version("1.0").title("Organization API").description("Documentation Organization API v1.0").build());
//	}
//
	@Bean
    OrganizationRepository repository() {
		OrganizationRepository repository = new OrganizationRepository();
		repository.add(new Organization("Microsoft", "Redmond, Washington, USA"));
		repository.add(new Organization("Oracle", "Redwood City, California, USA"));
		return repository;
	}
}
