package service;

import java.io.IOException;
import java.util.List;

import dto.Member;

// Service : 기능(비즈니스 로직) 제공 클래스/객체
// - 프로그램의 핵심 기능 작성
public interface MemberService {

	// 인터페이스의 메서드
	// - public abstract method (중요)
	// - default method
	
	/**
	 * 전달 받은 이름, 휴대폰 번호를 이용해서 회원 추가
	 * 단, 목록에 있는 회원 중 같은 번호의 회원이 존재하면
	 * false 반환 / 없으면 가입 후 true 반환
	 * @param name
	 * @param phone
	 * @return true / false(중복된 번호)
	 */
	public abstract boolean addMember(String name, String phone) throws IOException;

	
	/**
	 * 전체 회원 목록 조회
	 * @return memberList
	 */
	public abstract List<Member> getMemberList();
	
	
	
}
