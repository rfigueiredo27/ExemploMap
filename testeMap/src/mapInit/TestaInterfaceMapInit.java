package mapInit;

import java.util.HashMap;
import java.util.Map;
 
public class TestaInterfaceMapInit {
 
  public static void main(String[] args) {
   
    Map<Integer, String> mapaNomes = new HashMap<Integer, String>(); 
    mapaNomes.put(1, "Jo�o Delfino");
    mapaNomes.put(2, "Maria do Carmo");
    mapaNomes.put(3, "Claudinei Silva");
 
System.out.println(mapaNomes);
     
    //resgatando o nome da posi��o 2
    System.out.println(mapaNomes.get(2));
     
  }
}