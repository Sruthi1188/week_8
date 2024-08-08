package com.ironhack.week_8_lab.demo;



import com.ironhack.week_8_lab.model.Chapter;
import com.ironhack.week_8_lab.model.Member;
import com.ironhack.week_8_lab.repository.ChapterRepository;
import com.ironhack.week_8_lab.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ChapterDataLoader implements CommandLineRunner {
    @Autowired
    private ChapterRepository chapterRepository;
    @Autowired
    private MemberRepository memberRepository;

    @Override
    public void run(String... args) throws Exception {
        Member president = memberRepository.findById(1L).orElseThrow();
        Chapter chapter1 = new Chapter();
        chapter1.setName("Chapter A");
        chapter1.setDistrict("District 1");
        chapter1.setPresident(president);
        chapterRepository.save(chapter1);
        // Add more chapters
    }
}

