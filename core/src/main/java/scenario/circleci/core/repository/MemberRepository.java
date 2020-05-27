package scenario.circleci.core.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import scenario.circleci.core.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

  Optional<Member> findByName(String name);
}
