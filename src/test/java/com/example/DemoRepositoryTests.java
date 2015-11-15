package com.example;

import com.example.domain.Member;
import com.example.domain.RoleType;
import com.example.domain.Team;
import com.example.repository.MemberRepository;
import com.example.repository.TeamRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
public class DemoRepositoryTests {
	@Autowired
	private MemberRepository memberRepository;
	@Autowired
	private TeamRepository teamRepository;

	@Test
	@Transactional
	public void testJpa1() throws Exception {
		// 1. no session proxy 에러가 뜨는데, 같은 트랜젝션에서 작업을 해서 save해도 저장이 안되어 불러오지 않은 현상이 발생함
		Member member1 = new Member();
		Member member2 = new Member();
		Team team1 = new Team();
		Team team2 = new Team();

		team1.setTeamName("team1");
		team2.setTeamName("team2");

		team1 = teamRepository.save(team1);
		team2 = teamRepository.save(team2);

		member1.setUserName("userName1");
		member1.setRoleType(RoleType.USER);
		member1.setTeam(team1);

		member2.setUserName("userName2");
		member2.setRoleType(RoleType.USER);
		member2.setTeam(team2);

		member1 = memberRepository.save(member1);
		member2 = memberRepository.save(member2);

		team1 = teamRepository.findOne(team1.getId());
		team2 = teamRepository.findOne(team2.getId());

		log.info("member1 : " + member1.toString());
		log.info("member2 : " + member2.toString());

		log.info("team1 : " + team1.getMembers().size());

	}

	public void memberSave(){

	}

}
