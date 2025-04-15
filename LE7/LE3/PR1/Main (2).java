
abstract class Bharatvanshi {
    String name;


    public Bharatvanshi(String name) {
        this.name = name;
    }

    
    public abstract void fight();
}


class Pandav extends Bharatvanshi {
    
   
    public Pandav(String name) {
        super(name);
    }

    
    @Override
    public void fight() {
        System.out.println(name + " is fighting bravely!");
    }

    
    public void obey() {
        System.out.println(name + " is obedient.");
    }

   
    public void kind() {
        System.out.println(name + " is kind.");
    }
}


class Arjun extends Pandav {

  
    public Arjun(String name) {
        super(name);
    }

  
    @Override
    public void fight() {
        System.out.println(name + " is fighting skillfully with his bow and arrow!");
    }

    
    @Override
    public void kind() {
        System.out.println(name + " is very kind.");
    }
}


class Bheem extends Pandav {

    
    public Bheem(String name) {
        super(name);
    }

m
    @Override
    public void fight() {
        System.out.println(name + " is fighting with tremendous strength!");
    }

    
    @Override
    public void kind() {
        System.out.println(name + " is less kind but strong.");
    }
}


class Kaurav extends Bharatvanshi {

    
    public Kaurav(String name) {
        super(name);
    }

   
    @Override
    public void fight() {
        System.out.println(name + " is fighting aggressively!");
    }

   
    public void disobey() {
        System.out.println(name + " is disobedient.");
    }

    
    public void cruel() {
        System.out.println(name + " is cruel.");
    }
}


class Duryodhan extends Kaurav {

   
    public Duryodhan(String name) {
        super(name);
    }

  
    @Override
    public void fight() {
        System.out.println(name + " fights with anger and cruelty.");
    }

   
    @Override
    public void disobey() {
        System.out.println(name + " disobeys the rules and creates chaos.");
    }

   
    @Override
    public void cruel() {
        System.out.println(name + " is very cruel.");
    }
}


class Vikarn extends Kaurav {

   
    public Vikarn(String name) {
        super(name);
    }

    @Override
    public void fight() {
        System.out.println(name + " is a noble fighter, skilled and strong.");
    }

   
    @Override
    public void disobey() {
        System.out.println(name + " is obedient and follows the right path.");
    }

    
    @Override
    public void cruel() {
        System.out.println(name + " is kind and gentle.");
    }
}


public class Main {
    public static void main(String[] args) {
       
        Bharatvanshi arjun = new Arjun("Arjun");
        Bharatvanshi bheem = new Bheem("Bheem");
        Bharatvanshi duryodhan = new Duryodhan("Duryodhan");
        Bharatvanshi vikarn = new Vikarn("Vikarn");

        
        arjun.fight();
        ((Pandav) arjun).obey();
        ((Pandav) arjun).kind(); 
        
        bheem.fight();
        ((Pandav) bheem).obey(); 
        ((Pandav) bheem).kind(); 

      
        duryodhan.fight(); 
        ((Kaurav) duryodhan).disobey(); 
        ((Kaurav) duryodhan).cruel(); 
        
        vikarn.fight(); 
        ((Kaurav) vikarn).disobey(); 
        ((Kaurav) vikarn).cruel(); 
    }
}
