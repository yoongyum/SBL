package com.example.hello;

import com.example.hello.repository.MemoryMemberRepository;
import com.example.hello.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {


    @Bean
    public MemoryMemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }


}
