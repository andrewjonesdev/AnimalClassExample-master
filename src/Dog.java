/*
* All Cats are Animals but all Animals are not Cats
*/
public class Dog implements Animal {

public Dog()
{
//super();
System.out.println("Now I am a Dog!");
}

@Override
public String sleep() {
	return "A dog sleeps...";
}

@Override
public String eat() {
	return "A dog eats...";
}

public String woof(){
	return "woof!!!";
}

}

