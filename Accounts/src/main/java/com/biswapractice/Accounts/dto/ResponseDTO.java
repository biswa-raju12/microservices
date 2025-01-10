package com.biswapractice.Accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;



public class ResponseDTO {
    private String statusCode;
    private String statusMsg;

    public ResponseDTO() {
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMsg() {
        return statusMsg;
    }

    public void setStatusMsg(String statusMsg) {
        this.statusMsg = statusMsg;
    }

    public ResponseDTO(String statusCode, String statusMsg) {
        this.statusCode = statusCode;
        this.statusMsg = statusMsg;
    }
}
