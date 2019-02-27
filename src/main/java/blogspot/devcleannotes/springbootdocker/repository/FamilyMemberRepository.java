package blogspot.devcleannotes.springbootdocker.repository;

import blogspot.devcleannotes.springbootdocker.domain.FamilyMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamilyMemberRepository extends JpaRepository<FamilyMember, Long> {
}
