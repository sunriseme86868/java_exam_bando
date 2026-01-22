package exam1;

public class Car {
private String name;

public void putOnGas(){
    System.out.println(name+"に給油します。");
}
public void run(){
    System.out.println("ブーン!と走ります。");
}
public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

    
}
