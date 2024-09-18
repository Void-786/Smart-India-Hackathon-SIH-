package com.hackathon.backend.model.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.HashSet;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Admin implements User, UserDetails {

    @Id
    private String adminId;
    private String name;
    private String username;
    private String password;
    private String email;
    private String phone;
    private Collection<? extends GrantedAuthority> authorities;
    @DBRef
    private String communityId;
    @DBRef
    private Collection<Role> roles = new HashSet<>();

    @Override
    public String getId() {
        return adminId;
    }
}
