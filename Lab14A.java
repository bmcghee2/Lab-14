class BuildingBlueprint{
  private int numofs;
  private int numofa;
  private float occup;
  private Boolean full; 
  BuildingBlueprint(){
    numofs=10;
    numofa=20;
    occup=1.0f; 
    full=true; 
  }
  BuildingBlueprint(int numofs, int numofa,float occup){
    this.numofs=numofs; 
    this.numofa=numofa;
    this.occup=occup;
    if(occup==1.0f){
      full=true; 
    }
    else{
      full=false;
    }
  }
  public void set_occupr(float v){
    occup=v; 
    if(occup==1.0f){
      full=true;
    }
    else{
      full=false;
    }
  }
  public float get_occupr(){
    return occup; 
  }
  public int get_nums(){
    return numofs; 
  }
 public int get_numa(){
   return numofa; 
 }
  public boolean get_full(){
    return full; 
  }
}
class Lab14A {
  public static void main(String[] args) {
  BuildingBlueprint buildingOne= new BuildingBlueprint();
    BuildingBlueprint buildingTwo= new BuildingBlueprint(30, 30, 0.75f); 
    
    System.out.println("Year 2020:");
    System.out.println("Building 1 has "+ buildingOne.get_nums()+ " floors, " +buildingOne.get_numa() + " apartments, and is "+ (buildingOne.get_occupr()*100) + "% occupied. Full? " +buildingOne.get_full());
    
  System.out.println("Building 2 has "+ buildingTwo.get_nums()+ " floors, " +buildingTwo.get_numa() + " apartments, and is "+ (buildingTwo.get_occupr()*100) + "% occupied. Full? " +buildingTwo.get_full());

    System.out.println("\nMany years pass.");
    System.out.println("\nYear 2043:");

    buildingOne.set_occupr(0.0f); 
    buildingTwo.set_occupr(1.0f); 

    System.out.println("Building 1 has "+ buildingOne.get_nums()+ " floors, " +buildingOne.get_numa() + " apartments, and is "+ (buildingOne.get_occupr()*100) + "% occupied. Full? " +buildingOne.get_full());
    
  System.out.println("Building 2 has "+ buildingTwo.get_nums()+ " floors, " +buildingTwo.get_numa() + " apartments, and is "+ (buildingTwo.get_occupr()*100) + "% occupied. Full? " +buildingTwo.get_full());

    System.out.println("\nLooks like people prefer taller buildings."); 
  }
}

