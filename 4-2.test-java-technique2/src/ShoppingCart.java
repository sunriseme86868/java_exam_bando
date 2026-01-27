import java.util.ArrayList;
import java.util.LinkedList;

public class ShoppingCart extends LinkedList{
    ArrayList<Item>itemlist =new ArrayList<>();

    public void addItem(Item item){
        itemlist.add(item);
    }

    public int ItemSize(){
        return itemlist.size();
    }

    public int getTotalPrice(){
        int total=0;
        for(Item item : itemlist){
            total += itemlist.size;
        }
        return total
    }
    public 

}
