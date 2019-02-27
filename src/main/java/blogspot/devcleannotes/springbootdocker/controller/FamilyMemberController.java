package blogspot.devcleannotes.springbootdocker.controller;

import blogspot.devcleannotes.springbootdocker.domain.FamilyMember;
import blogspot.devcleannotes.springbootdocker.service.FamilyMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class FamilyMemberController {


    final FamilyMemberService familyMemberService;


    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity postMember(@RequestBody FamilyMember familyMember) {
        return ResponseEntity.status(HttpStatus.CREATED).body(familyMemberService.saveMember(familyMember));
    }


    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getMember(@PathVariable("id") Long id) {
        return ResponseEntity.ok(familyMemberService.getMemberById(id));
    }


}
