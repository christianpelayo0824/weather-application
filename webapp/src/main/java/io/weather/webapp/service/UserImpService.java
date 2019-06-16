/**
 * 
 */
package io.weather.webapp.service;

import org.springframework.stereotype.Service;

import io.weather.webapp.entity.User;
import io.weather.webapp.facade.UserFacade;
import io.weather.webapp.repository.UserRepository;

/**
 * @author christian
 *
 */
@Service
public class UserImpService implements UserFacade {

	private UserRepository userRepository;

	/**
	 * @param userRepository
	 */
	public UserImpService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public void createUser(User user) {
		this.userRepository.save(user);
	}

}