package fr.project.store.config;

import fr.project.store.Entites.Category;
import fr.project.store.Entites.Product;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class RestConfig implements RepositoryRestConfigurer {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        //Creating an array of HttpMethods
        HttpMethod[] unsupportedActions = {HttpMethod.POST, HttpMethod.DELETE, HttpMethod.PUT};

        //disable them for product
        config.getExposureConfiguration().forDomainType(Product.class)
                //for a given product
        .withItemExposure((metdata, httpMethods) -> httpMethods.disable(unsupportedActions))
                //for collection exposure
        .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(unsupportedActions));
            //disable for Category
        config.getExposureConfiguration().forDomainType(Category.class)
                //for a given product
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(unsupportedActions))
                //for collection exposure
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(unsupportedActions));
    }
}
