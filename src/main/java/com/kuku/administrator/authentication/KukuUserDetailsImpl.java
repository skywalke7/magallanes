package com.kuku.administrator.authentication;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class KukuUserDetailsImpl implements UserDetails {

	private static final long serialVersionUID = 7989582422369013373L;

	protected final Log logger = LogFactory.getLog(getClass());

	private String username;
	private String password;
	private Set<GrantedAuthority> authorities;
	private boolean accountNonExpired;
	private boolean accountNonLocked;
	private boolean credentialsNonExpired;
	private boolean enabled;

	public KukuUserDetailsImpl() {

	}

	public KukuUserDetailsImpl(String username, String password,
			Collection<? extends GrantedAuthority> authorities) {

		this.username = username;
		this.password = password;
		this.authorities = Collections
				.unmodifiableSet(sortAuthorities(authorities));
		this.accountNonExpired = true;
		this.accountNonLocked = true;
		this.accountNonExpired = true;
		this.enabled = true;
<<<<<<< HEAD
		this.credentialsNonExpired = true;
		
=======

>>>>>>> Warnings supressed and all source code formatted
	}

	private static SortedSet<GrantedAuthority> sortAuthorities(
			Collection<? extends GrantedAuthority> authorities) {

		SortedSet<GrantedAuthority> aut = new TreeSet<GrantedAuthority>(
				new AuthorityComparator());

		for (GrantedAuthority g : authorities)
			aut.add(g);

		new KukuUserDetailsImpl().logger
				.info("Everything ok until now, getting info from the database");

		return aut;

	}

	private static class AuthorityComparator implements
			Comparator<GrantedAuthority>, Serializable {

		private static final long serialVersionUID = 8270441438998366587L;

		public int compare(GrantedAuthority g1, GrantedAuthority g2) {
			// Neither should ever be null as each entry is checked before
			// adding it to the set.
			// If the authority is null, it is a custom authority and should
			// precede others.
			if (g2.getAuthority() == null) {
				return -1;
			}

			if (g1.getAuthority() == null) {
				return 1;
			}

			return g1.getAuthority().compareTo(g2.getAuthority());
		}
	}

	// Setters and Getters

	public Collection<GrantedAuthority> getAuthorities() {
		return authorities;
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}

	public boolean isAccountNonExpired() {
		return accountNonExpired;
	}

	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}

	public boolean isCredentialsNonExpired() {
		return credentialsNonExpired;
	}

	public boolean isEnabled() {
		return enabled;
	}

}
