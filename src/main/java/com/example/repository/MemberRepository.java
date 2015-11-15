package com.example.repository;

import com.example.domain.Member;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by BoBinLee on 2015. 11. 8..
 */
public interface MemberRepository extends CrudRepository<Member, Long> {
}
