package com.kugring.back.service;

import org.springframework.http.ResponseEntity;

import com.kugring.back.dto.request.order.FilterOrderListRequestDto;
import com.kugring.back.dto.request.order.PatchOrderListRequestDto;
import com.kugring.back.dto.request.order.PostOrderListRequestDto;
import com.kugring.back.dto.request.order.PutOrderListRequestDto;
import com.kugring.back.dto.response.order.FilterOrderListResponseDto;
import com.kugring.back.dto.response.order.PatchOrderListResponseDto;
import com.kugring.back.dto.response.order.PostOrderListResponseDto;
import com.kugring.back.dto.response.order.PutOrderListResponseDto;

public interface OrderService {

  // ResponseEntity<? super FilterOrderListResponseDto> filterOrderList(FilterOrderListRequestDto dto);

  ResponseEntity<? super PostOrderListResponseDto> postOrderList(PostOrderListRequestDto dto);

  // ResponseEntity<? super PatchOrderListResponseDto> patchOrderList(Integer orderListId, PatchOrderListRequestDto dto);

  // ResponseEntity<? super PutOrderListResponseDto> putOrderList(Integer orderListId, PutOrderListRequestDto dto);



}
