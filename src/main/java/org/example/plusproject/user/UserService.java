package org.example.plusproject.user;

import org.example.plusproject.user.request.SignUpRequestDto;

public interface UserService {
    /**
     * 회원가입
     * @param requestDto 회원가입 요청 정보
     * @return 생성된 유저 정보
     */
    User signUp(SignUpRequestDto requestDto);
}
