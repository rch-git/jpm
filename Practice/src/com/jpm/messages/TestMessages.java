package com.jpm.messages;

import com.jpm.msg.impl.Msg;
import com.jpm.msg.interfaces.IMsgLstnr;

public class TestMessages implements IMsgLstnr
{
	static MsgSubscrbr ms;
	
	public static void main(String[] args)
	{
		TestMessages tm = new TestMessages();
		tm.run();
	}
	
	public void run()
	{
		Lstnr lstnr = new Lstnr();
		ms = new MsgSubscrbr("New-Msg_scrbr", lstnr);
		ms.setMsgLstnr(this);
	}
	
	@Override
	public void onMsg(Msg message)
	{
		System.out.println("Coming from main; Message ID: " + message.getJMSMsgID());
	}
	
	private class Lstnr implements IMsgLstnr
	{

		@Override
		public void onMsg(Msg message)
		{
			System.out.println("Coming from inner class. MSG ID: " + message.getJMSMsgID());
		}
		
	}
}
