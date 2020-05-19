package com.jpm.msg.interfaces;

import com.jpm.msg.impl.Msg;

public interface IMsgLstnr
{
	void onMsg(Msg message);
}
