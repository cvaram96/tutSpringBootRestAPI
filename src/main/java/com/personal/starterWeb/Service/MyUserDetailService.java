package com.personal.starterWeb.Service;

import com.personal.starterWeb.Bean.MyUserDetails;
import com.personal.starterWeb.Bean.User;
import com.personal.starterWeb.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    UserDao userDao;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<User> user = userDao.findByUserName(s);
        user.orElseThrow(()->new UsernameNotFoundException("Not found "+s));
        return user.map(MyUserDetails::new).get();
    }
}
