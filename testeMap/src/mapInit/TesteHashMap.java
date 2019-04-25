package mapInit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
 
public class TesteHashMap {
 
  public static void main(String[] args) {
   
    Map<Integer,String> mapaNomes = new HashMap<Integer,String>(); 
    mapaNomes.put(1, "João Delfino");
    mapaNomes.put(2, "Maria do Carmo");
    mapaNomes.put(3, "Claudinei Silva");
     
    //Collection<integer> conjNomes = mapaNomes.keySet();
     
    Set<Entry<Integer,String>> set = mapaNomes.entrySet();
    Iterator<Entry<Integer, String>> it = set.iterator();
     
    System.out.println("Código\t\tValor");
     
                 //getKey() - recupera a chave do mapa 
    //getValue() - recupera o valor do mapa
 
    while(it.hasNext()){
      Entry<Integer,String> entry = it.next();
      System.out.println(entry.getKey() + "\t\t"+entry.getValue());
    }
    System.out.println("\n\nIteração por FOR Clássico\n");
    
    System.out.println("Código\t\tValor");
    for(int i = 1; i <= mapaNomes.size(); i++){
    	  System.out.println(i + "\t\t" + mapaNomes.get(i));
    	}
  }
}