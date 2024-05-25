package de.ait.ec.security.details;

import de.ait.ec.models.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AuthenticatedUser implements UserDetails {

    private final User user;

    public AuthenticatedUser(User user){
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        /*
    // В нашем случае права пользователя определяются его ролью в приложении ( например USER, ADMIN  и т.д.)
        // нужно взять роль пользователя как строку
        String role = user.getRole().toString();
        // обернем ее в обьект Spring Security
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role);
        // Spring Security  предполагает, что у пользователя может быть много прав ( ролей) поэтому
        // он просит коллекцию
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(authority);
        return authorities;

         */
        return Collections.singleton(new SimpleGrantedAuthority("ROLE_" + user.getRole().toString()));
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
