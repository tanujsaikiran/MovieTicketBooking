package com.capg.mtb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capg.mtb.model.User;
import com.capg.mtb.repository.IAdminRepository;
import com.capg.mtb.repository.ICustomerRepository;
import com.capg.mtb.repository.IUserRepository;
import com.capg.mtb.service.IUserService;

@Component
public class IUserServiceImpl implements IUserService {

	@Autowired
	IUserRepository iUserRepository;

	@Autowired
	ICustomerRepository iCustomerRepository;

	@Autowired
	IAdminRepository IAdminRepository;

	@Override
	public User addUser(User user)	 {

		user = iUserRepository.save(user);

		if (user.getRole().equals("Customer")) {
			iCustomerRepository.save(user.getCustomer());

		} else if (user.getRole().equals("Admin")) {
			IAdminRepository.save(user.getAdmin());
		}

		return iUserRepository.save(user);
	}

}
