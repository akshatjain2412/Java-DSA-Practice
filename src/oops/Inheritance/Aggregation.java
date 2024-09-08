package oops.Inheritance;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

public class Aggregation {


public static class Car{
    private int modelNo;
    private String Name;
    List<Component> Components;
    public Car(){

    }
    public Car(int modelNo,String Name,List<Component> Components){
        this.Name=Name;
        this.modelNo=modelNo;
        this.Components=Components;
    }
    int setModelNo()
    {
        return this.modelNo;
    }
    String color(){
        return Name;
    }
    void addComponents(Component Compo){
        Components.add(Compo);
    }
    List<Component> getComponents(){
        return this.Components;
    }
}

public static class Material{
    private String mName;
    public Material(String mName){
        this.mName=mName;
    }
    String getmName(){
        return this.mName;
    }

}

public static class Component{
    private String componentName;
    private List<Material> materialList;
    public Component() {

    }
    public Component(String componentName,List<Material> materialList){
        this.componentName=componentName;
        this.materialList=materialList;
    }
    String getComponentName(){
        return this.componentName;
    }
    void addComponents(Material mat){
        materialList.add(mat);
    }
    List<Material> getMaterialList(){
        return materialList;
    }
}
static int total_material(Car car){
    int total_material=0;
    List<Material>material=null;
    for(Component c: car.getComponents()){
        material=c.getMaterialList();
        for(Material t:material){
            total_material++;
        }
    }
    return total_material;
}
    public static void main(String[] args) {
        Material plastic=new Material("plastic");
        Material Steel=new Material("Steel");
        Material Leather=new Material("Leather");

        List<Material> seat=new ArrayList<>();
        seat.add(plastic);
        seat.add(Leather);
        Component Seat=new Component("Seat",seat);

        List<Material> body=new ArrayList<>();
        body.add(Steel);
        body.add(plastic);
        Component Body=new Component("Body",body);

        List<Component> car=new ArrayList<>();
        car.add(Body);
        car.add(Seat);

        Car c=new Car(213,"BMW",car);

        System.out.println(total_material(c));

    }
}

