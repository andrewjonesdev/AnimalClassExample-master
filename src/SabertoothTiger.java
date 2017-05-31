/*
* All Cats are Animals but all Animals are not Cats
*/
public class SabertoothTiger implements Animal {

public SabertoothTiger()
{
//super();
System.out.println("Now I am a sabertooth tiger!");
}

@Override
public String sleep() {
	return "A sabertooth tiger sleeps...";
}

@Override
public String eat() {
	return "A sabertooth tiger eats...";
}

public String pounces(){
	return "A sabertooth tiger pounces...";
}

}

