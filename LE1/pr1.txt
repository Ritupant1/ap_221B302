public class Juet {
    
     String name;
     int age;


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

  
    public int getAge() {
        return age;
    }

   
    public void setAge(int age) {
            this.age = age;
        
    }


    public static void main(String[] args) {
      
        Juet obj = new Juet();

     
        obj.setName("Riya");
        obj.setAge(20);

      
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());

       
        
    }
}