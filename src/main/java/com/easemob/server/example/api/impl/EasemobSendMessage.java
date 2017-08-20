package main.java.com.easemob.server.example.api.impl;

import main.java.com.easemob.server.example.api.SendMessageAPI;
import main.java.com.easemob.server.example.comm.OrgInfo;
import main.java.com.easemob.server.example.comm.ResponseHandler;
import main.java.com.easemob.server.example.comm.EasemobAPI;
import main.java.com.easemob.server.example.comm.TokenUtil;
import io.swagger.client.ApiException;
import io.swagger.client.api.MessagesApi;
import io.swagger.client.model.Msg;

public class EasemobSendMessage implements SendMessageAPI {
    private ResponseHandler responseHandler = new ResponseHandler();
    private MessagesApi api = new MessagesApi();
    @Override
    public Object sendMessage(final Object payload) {
        return responseHandler.handle(new EasemobAPI() {
            @Override
            public Object invokeEasemobAPI() throws ApiException {
                return api.orgNameAppNameMessagesPost(OrgInfo.ORG_NAME,OrgInfo.APP_NAME,TokenUtil.getAccessToken(), (Msg) payload);
            }
        });
    }
}
