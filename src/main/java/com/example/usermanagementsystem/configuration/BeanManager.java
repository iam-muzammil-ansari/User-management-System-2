package com.example.usermanagementsystem.configuration;

import com.example.usermanagementsystem.model.Type;
import com.example.usermanagementsystem.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanManager {

    @Bean
    public List<User> getInitializedList() {
        User initUser = new User(0,"Ayaan","ayaanansari097@gmail.com","abed","1345682794",23, LocalDate.of(2000,12,16), Type.ADMIN);
        List<User> initList = new ArrayList<>();
        initList.add(initUser);

        return initList;
    }
}
