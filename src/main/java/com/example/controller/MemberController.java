package com.example.controller;

import com.example.domain.Member;
import com.example.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ekansh on 12/7/15.
 */

@Controller
@RequestMapping(value = {"/member"})
public class MemberController {
    @Autowired
    private MemberRepository memberRepository;

    @RequestMapping(value = "save", method = RequestMethod.GET)
    public String save(){
        Member member = new Member();
        member.setAge(1);

        memberRepository.save(member);
        return "success";
    }
}
