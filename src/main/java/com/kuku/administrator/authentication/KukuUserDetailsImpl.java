package com.kuku.administrator.authentication;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.hibernate.validator.constraints.impl.LuhnValidator;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class KukuUserDetailsImpl implements UserDetails{

	private String username;
	private String password;
	private Set<GrantedAuthority> authorities;
    private boolean accountNonExpired;
    private boolean accountNonLocked;
    private boolean credentialsNonExpired;
    private boolean enabled;
	
	public KukuUserDetailsImpl(){}
	public KukuUserDetailsImpl(String username, String password, Collection<? extends GrantedAuthority> authorities){
		
		this.username = username;
		this.password = password;
		this.authorities = Collections.unmodifiableSet(sortAuthorities(authorities));
		this.accountNonExpired = true;
		this.accountNonLocked = true;
		this.accountNonExpired = true;
		this.enabled = true;
		
		
	}
	
	private static SortedSet<GrantedAuthority> sortAuthorities(Collection<? extends GrantedAuthority> authorities){
		
		SortedSet<GrantedAuthority> aut = new TreeSet<GrantedAuthority>(new AuthorityComparator());
		
		for(GrantedAuthority g : authorities)
			aut.add(g);
		
		System.out.println("HACE TODO EL DESMADRE");
		return aut;
	}
	
	private static class AuthorityComparator implements Comparator<GrantedAuthority>, Serializable {
        public int compare(GrantedAuthority g1, GrantedAuthority g2) {
            // Neither should ever be null as each entry is checked before adding it to the set.
            // If the authority is null, it is a custom authority and should precede others.
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
		// TODO Auto-generated method stub
		return authorities;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return accountNonExpired;
	}

	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return accountNonLocked;
	}

	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return credentialsNonExpired;
	}

	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return enabled;
	}

}
