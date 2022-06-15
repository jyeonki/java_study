package com.kh.practice.chap02_abstractNInterface.model.vo;

public interface CellPhone extends Phone, Camera{

    String charge(); // 충전 방식
}
