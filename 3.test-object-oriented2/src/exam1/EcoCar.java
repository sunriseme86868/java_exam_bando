package exam1;

public class EcoCar extends Car{
    private String name;

    EcoCar(){}
    EcoCar(String name){
        this.name =name;
    }

    @Override
    public void run(){
       System.out.println("シーン!"+name+"が走ります。"); 
    }
    


}
