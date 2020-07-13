package com.revision;

public class HelpLine {
	Command command[]=new Command[5];
	public HelpLine()
	{
		for(int i=0;i<command.length;i++)
		{
			command[i]=new DummyCommand();
		}
		
	}
	public void setCommand(Command cmd,int slot)
	{
		 command[slot]=cmd;
	}
	public void useCommand(int slot)
	{
		command[slot].action();
	}

}
abstract class Command 
{
	public abstract void action();
	
}
class DummyCommand extends Command
{
	public void action()
	{
		System.out.println(" dummy");
	}
}

class People extends Command
{
	public void action()
	{
		new Dog().handle();
		new Tiger().handle();
		new OfficeBoy().handle();
	}
}