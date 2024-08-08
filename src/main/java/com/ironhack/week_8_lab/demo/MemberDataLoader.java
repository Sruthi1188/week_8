package com.ironhack.week_8_lab.demo;

import com.ironhack.week_8_lab.enums.MemberStatus;
import com.ironhack.week_8_lab.model.Member;
import com.ironhack.week_8_lab.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class MemberDataLoader implements CommandLineRunner {
    @Autowired
    private MemberRepository memberRepository;

    @Override
    public void run(String... args) throws Exception {
        Member member1 = new Member();
        member1.setName("John Doe");
        member1.setStatus(MemberStatus.ACTIVE);
        member1.setRenewalDate(LocalDate.now().plusYears(1));
        memberRepository.save(member1);
        // Add more members
    }
}

