class NamedCow extends Cow
{
	String myName;

	NamedCow(String type,String name, String sound){
		myType = type;
		myName = name;
		mySound = sound;
	}

	public String getName(){
		return myName;
	}
}