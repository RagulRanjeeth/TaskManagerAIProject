//    package com.example.TaskManagerAI.Services;
//
//    import com.example.TaskManagerAI.Entity.UserEntity;
//    import com.example.TaskManagerAI.Repositor.UserRepositor;
//    import org.springframework.beans.factory.annotation.Autowired;
//    import org.springframework.security.core.userdetails.*;
//    import org.springframework.security.core.authority.SimpleGrantedAuthority;
//    import org.springframework.stereotype.Service;
//
//    import java.util.List;
//
//    @Service
//    public class CustomUserDetailsservice implements UserDetailsService {
//
//        @Autowired
//        private UserRepositor userRepositor;
//
//        @Override
//        public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//
//            UserEntity user = userRepositor.findByEmail(email)
//                    .orElseThrow(() -> new UsernameNotFoundException("User not found: " + email));
//
//            return new org.springframework.security.core.userdetails.User(
//                    user.getEmail(),
//                    user.getPassword(),
//                    List.of(new SimpleGrantedAuthority(user.getRole()))
//            );
//        }
//    }