/*
* All Cats are Animals but all Animals are not Cats
*/
public class Monkey implements Animal {

public Monkey()
{
//super();
System.out.println("Now I am a Monkey!");
}

@Override
public String sleep() {
	return "A monkey sleeps...";
}

@Override
public String eat() {
	return "A monkey eats...";
}

public String climbs(){
	return "A monkey climbs...";
}

}

