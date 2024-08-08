package com.ironhack.week_8_lab.repository;


import com.ironhack.week_8_lab.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}

