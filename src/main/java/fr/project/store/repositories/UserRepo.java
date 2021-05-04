package fr.project.store.repositories;

import fr.project.store.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    //@Query is for defining custom query
    //@Modifying is for telling spring-data-jpa that this query is an update operation and it requires executeUpdate() not executeQuery().
    @Modifying
    @Query("update User u set u.userName = ?1, u.password = ?2 where u.id = ?3")
    void setUserInfoById(String userName, String password, Integer userId);

}
