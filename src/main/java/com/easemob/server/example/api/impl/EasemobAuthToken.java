package main.java.com.easemob.server.example.api.impl;

import main.java.com.easemob.server.example.api.AuthTokenAPI;
import main.java.com.easemob.server.example.comm.TokenUtil;


public class EasemobAuthToken implements AuthTokenAPI{

	@Override
	public Object getAuthToken(){
		return TokenUtil.getAccessToken();
	}
}
