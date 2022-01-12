package com.jpm.section09.interfaces.challenge.saveable.solution;

import java.util.List;

public interface ISavable
{
	List<String> write();
	void read(List<String> savedValues);
}
