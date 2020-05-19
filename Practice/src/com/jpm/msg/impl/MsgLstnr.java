package com.jpm.msg.impl;

import com.jpm.msg.interfaces.IMsgLstnr;


public class MsgLstnr implements IMsgLstnr
{

	@Override
	public void onMsg(Msg message)
	{
		System.out.println("MsgLstnr. Message ID: " + message.getJMSMsgID());
	}
	
}
