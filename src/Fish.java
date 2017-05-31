/*
* All Cats are Animals but all Animals are not Cats
*/
public class Fish implements Animal {

public Fish()
{
//super();
System.out.println("Now I am a fish!");
}

@Override
public String sleep() {
	return "A fish sleeps...";
}

@Override
public String eat() {
	return "A fish eats...";
}

public String swims(){
	return "A fish swims...";
}

}

