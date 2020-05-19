package com.jpm.msg.impl;

import com.jpm.msg.interfaces.IMsg;

public class Msg implements IMsg
{
	private String JMS_ID; 

	@Override
	public String getJMSMsgID()
	{
		return this.JMS_ID;
	}
	
	public void getJMSMsgID(String JMS_ID)
	{
		this.JMS_ID = JMS_ID;
	}

}
