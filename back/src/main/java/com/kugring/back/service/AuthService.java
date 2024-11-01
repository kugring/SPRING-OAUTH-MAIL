package com.kugring.back.service;

import org.springframework.http.ResponseEntity;

import com.kugring.back.dto.request.auth.CheckCertificationRequestDto;
import com.kugring.back.dto.request.auth.EmailCertificationRequestDto;
import com.kugring.back.dto.response.auth.CheckCertificationResponseDto;
import com.kugring.back.dto.response.auth.EmailCertificationResponseDto;
import com.kugring.back.dto.request.auth.IdCheckRequestDto;
import com.kugring.back.dto.request.auth.PinCheckRequestDto;
import com.kugring.back.dto.request.auth.SignInRequestDto;
import com.kugring.back.dto.request.auth.SignUpRequestDto;
import com.kugring.back.dto.response.auth.IdCheckResponseDto;
import com.kugring.back.dto.response.auth.PinCheckResponseDto;
import com.kugring.back.dto.response.auth.SignInResponseDto;
import com.kugring.back.dto.response.auth.SignUpResponseDto;


public interface AuthService {

  ResponseEntity<? super IdCheckResponseDto> idCheck(IdCheckRequestDto dto);

  ResponseEntity<? super EmailCertificationResponseDto> emailCertification(EmailCertificationRequestDto dto);

  ResponseEntity<? super CheckCertificationResponseDto> checkCertification(CheckCertificationRequestDto dto);

  ResponseEntity<? super SignUpResponseDto> signUp(SignUpRequestDto dto);

  ResponseEntity<? super SignInResponseDto> signIn(SignInRequestDto dto);

  ResponseEntity<? super PinCheckResponseDto> pinCheck(PinCheckRequestDto dto);

}
