package com.revature.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.revature.details.beans.FaceUser;
import com.revature.details.repo.FaceUserRepo;

@Service(value = "userDetailsService")
public class PerformLoginService implements UserDetailsService {

	@Autowired
	FaceUserRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		FaceUser dbUser = userRepo.findByfaceUsername(username);
		// Spring Security doesn't take your FaceUser pojo, it wants a Spring Security
		// User
		// We need to convert our Application User (FaceUser) to a Spring Security User
		boolean accountNonExpired = true;
		boolean credentialsNonExpired = true;
		boolean accountNonLocked = true;
		boolean isEnabled = true;

		return new User(dbUser.getFaceUsername(), dbUser.getFacePassword(), isEnabled, accountNonExpired,
				credentialsNonExpired, accountNonLocked, getAuthorities(Integer.toString(dbUser.getRoleId())));
	}

	public List<String> getRolesAsList(String roles) {
		List<String> rolesAsList = new ArrayList<String>();
		rolesAsList.add("ROLE_USER");
		return rolesAsList;
	}

	public static List<GrantedAuthority> getGrantedAuthorities(List<String> roles) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		for (String role : roles) {
			authorities.add(new SimpleGrantedAuthority(role));
		}
		return authorities;
	}

	public Collection<? extends GrantedAuthority> getAuthorities(String roles) {
		List<GrantedAuthority> authList = getGrantedAuthorities(getRolesAsList(roles));
		System.out.println("Auth list: " + authList);
		return authList;

	}

}
