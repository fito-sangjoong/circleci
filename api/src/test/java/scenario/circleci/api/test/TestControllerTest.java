package scenario.circleci.api.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import scenario.circleci.core.entity.Member;
import scenario.circleci.core.repository.MemberRepository;

@SpringBootTest
public class TestControllerTest {

  @Autowired private MemberRepository memberRepository;

  @Test
  public void tdd() throws Exception {
    // given
    String name = "name";
    String email = "email";

    // when
    memberRepository.save(Member.builder().name(name).email(email).build());
    Member member = memberRepository.findByName(name)
        .orElseThrow(() -> new IllegalArgumentException("haha exception"));

    // then
    assertThat(member.getName()).isEqualTo(name);
    assertThat(member.getEmail()).isEqualTo(email);
  }
}
