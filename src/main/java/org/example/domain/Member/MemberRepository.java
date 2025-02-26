package org.example.domain.Member;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends CrudRepository<Member, Long> {
    Optional<Member> findMemberByMemberName(String memberName);

    Optional<Member> findMemberByMembershipType(String membershipType);

    Optional<Member> findMemberByPhoneNumber(String phoneNumber);
}