/*
* All Cats are Animals but all Animals are not Cats
*/
public class Unicorn implements Animal {

public Unicorn()
{
//super();
System.out.println("Now I am a unicorn!");
}

@Override
public String sleep() {
	return "A unicorn sleeps...";
}

@Override
public String eat() {
	return "A unicorn eats...";
}

public String impales(){
	return "A unicorn impales...";
}

}

