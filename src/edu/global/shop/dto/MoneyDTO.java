package edu.global.shop.dto;

import java.util.Date;

public class MoneyDTO {
    private int salenol; // 판매번호
    private int pcost; // 단가
    private int amount; // 수량
    private int price; // 가격
    private String pcode; // 상품코드
    private String sdate; // 판매일자
    private int custno; // 회원번호 (외래키)

    public MoneyDTO() {
    }

    public MoneyDTO(int salenol, int pcost, int amount, int price, String pcode, String sdate, int custno) {
        this.salenol = salenol;
        this.pcost = pcost;
        this.amount = amount;
        this.price = price;
        this.pcode = pcode;
        this.sdate = sdate;
        this.custno = custno;
    }

    public int getSalenol() {
        return salenol;
    }

    public void setSalenol(int salenol) {
        this.salenol = salenol;
    }

    public int getPcost() {
        return pcost;
    }

    public void setPcost(int pcost) {
        this.pcost = pcost;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public String getSdate() {
        return sdate;
    }

    public void setSdate(String sdate) {
        this.sdate = sdate;
    }

    public int getCustno() {
        return custno;
    }

    public void setCustno(int custno) {
        this.custno = custno;
    }
}
