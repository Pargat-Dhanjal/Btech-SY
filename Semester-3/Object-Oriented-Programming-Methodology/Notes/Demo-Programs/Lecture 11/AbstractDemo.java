abstract class Animal
{
   String name;
   String species;
  //constructor of the abstract class
   Animal(String name, String species)
   {
      this.name = name;
      this.species = species;
     }
    void eat(String fooditem)
    {
       System.out.println(species+ " " + name + " likes to have " + fooditem);
     }
    abstract void sound();
}	

class Lion extends Animal
{
  Lion()
  {
    super("Lion","Asiatic Lion");
  }
  void sound()
  {
     System.out.println("Lions roar");
  }
}

class AbstractDemo
{
   public static void main(String[] args)
   {
       Lion l = new Lion();
       l.eat("flesh");
       l.sound();
     }
 } 
        