package com.jpm.messages;


import com.jpm.msg.interfaces.IMsgLstnr;

public class MsgSubscrbr
{
	private IMsgLstnr ImsgLstnr;
	private String name;

	public IMsgLstnr getMsgLstnr()
	{
		return ImsgLstnr;
	}

	public void setMsgLstnr(IMsgLstnr msgLstnr)
	{
		this.ImsgLstnr = msgLstnr;
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public MsgSubscrbr(String name, IMsgLstnr imsgLstnr)
	{
		this.name = name;
		this.ImsgLstnr = imsgLstnr;
	}
	
}
