package com.kugring.back.common;

public interface ResponseCode {

  String SUCCESS = "SU";

  String NOT_EXISTED_USER = "NUS";
  String NOT_EXISTED_MANAGER = "NMG";
  String NOT_EXISTED_OPTION = "NOP";
  String NOT_EXISTED_MENU = "NMN";
  String NOT_EXISTED_ORDER = "NO";
  String NOT_EXISTED_ORDER_STATUS = "NOS";
  String NOT_EXISTED_ORDER_ITEM = "NOI";
  String NOT_EXISTED_ORDER_ITEM_OPTION = "NOIO";



  String VALIDATION_FAIL = "VF";
  String DUPLICATE_ID = "DI";

  String SIGN_IN_FAIL = "SF";
  String CERTIFICATION_FAIL = "CF";

  String MAIL_FAIL = "MF";
  String DATABASE_ERROR = "DBE";

  String PIN_CHECK_FAIL = "PF";

  String CANCEL_POINT_CHARGE_FAIL = "CPF";
  String POINT_CHARGE_FAIL = "PCF";
  String ALREADY_POINT_CHARGE = "APC";

  String ORDER_FAIL = "OF";
  String INSUFFICIENT_BALANCE = "IB";

  String REFUND_FAIL = "RF";
}
