package com.pineone.icbms.sda.comm.dto;

public class ResultMessage_ {

	String _resultCode;
	String _result;
	
	public String get_resultCode() {
		return _resultCode;
	}
	public void set_resultCode(String _resultCode) {
		this._resultCode = _resultCode;
	}
	public String get_result() {
		return _result;
	}
	public void set_result(String _result) {
		this._result = _result;
	}
	@Override
	public String toString() {
		return "ResultMessage [_resultCode=" + _resultCode + ", _result=" + _result + "]";
	}

	
	
}
