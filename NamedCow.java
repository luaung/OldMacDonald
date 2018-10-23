class NamedCow extends Cow
{
	NamedCow(String type,String name, String sound){
		myType = type;
		myName = name;
		mySound = sound;
	}

	public void getName(){
		return myName;
	}
}