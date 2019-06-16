/**
 * 
 */
package io.weather.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.weather.webapp.entity.User;

/**
 * 
 * This is the interface of the User Entity that</br>
 * serve as the main connection to the database.
 * 
 * @author christian
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {

}