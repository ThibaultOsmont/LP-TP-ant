package com.iutnantes.tOsmont.mesTaches;

import org.apache.tools.ant.BuildException;

public class MaTacheAditionner extends org.apache.tools.ant.Task{
	private int arg0, arg1;

	public int getArg0() {
		return arg0;
	}

	public void setArg0(int arg0) {
		this.arg0 = arg0;
	}

	public int getArg1() {
		return arg1;
	}

	public void setArg1(int arg1) {
		this.arg1 = arg1;
	}
	
	public void execute() throws BuildException {
		int resultat = arg0+arg1;
		System.out.println(arg0 + " + " + arg1 +" = " + resultat +" !!!");
	}
}
