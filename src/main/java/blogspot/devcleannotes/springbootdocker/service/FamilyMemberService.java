package blogspot.devcleannotes.springbootdocker.service;

import blogspot.devcleannotes.springbootdocker.domain.FamilyMember;
import blogspot.devcleannotes.springbootdocker.repository.FamilyMemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FamilyMemberService {

    final FamilyMemberRepository familyMemberRepository;

    public FamilyMember saveMember(FamilyMember familyMember) {
        return familyMemberRepository.save(familyMember);
    }

    public FamilyMember getMemberById(Long id) {
        return familyMemberRepository.findById(id).orElse(null);
    }


}
