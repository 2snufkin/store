package fr.project.store.config;

import fr.project.store.entites.Category;
import fr.project.store.entites.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.EntityType;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Configuration
public class RestConfig implements RepositoryRestConfigurer {

    final EntityManager entityManager;

    @Autowired
    public RestConfig(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        //Creating an array of HttpMethods
        HttpMethod[] unsupportedActions = { HttpMethod.DELETE, HttpMethod.PUT};

        //disable them for product
        config.getExposureConfiguration().forDomainType(Product.class)
                //for a given product
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(unsupportedActions))
                //for collection exposure
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(unsupportedActions));
        //disable for Category
        config.getExposureConfiguration().forDomainType(Category.class)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(unsupportedActions))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(unsupportedActions));

        exposeId(config);
    }


    private void exposeId(RepositoryRestConfiguration configRepo) {
        List<Class> entityList = new ArrayList<>();
        // the entity manager holds all the entites, I will ask it for a list of all of the entites
        Set<EntityType<?>> entites = entityManager.getMetamodel().getEntities();
        //I will parcour the Set and I will add every entity to my list
        for (EntityType<?> entity : entites) {
            entityList.add(entity.getJavaType());
        }
        //I will convert it to an array (ArrayList to Array)
        Class[] domainTypes = entityList.toArray(new Class[0]);
        configRepo.exposeIdsFor(domainTypes);

    }
}


