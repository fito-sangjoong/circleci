package scenario.circleci.core.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Member {

  @Id @GeneratedValue private Long id;

  private String name;
  private String email;

  @Builder
  public Member(String name, String email) {
    this.name = name;
    this.email = email;
  }
}
