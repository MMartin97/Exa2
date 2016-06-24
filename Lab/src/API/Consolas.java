/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

/**
 *
 * @author Martin
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.*;

public class Consolas {
	public static String getHTML(String urlToRead) throws Exception {
		StringBuilder result = new StringBuilder();
		URL url = new URL(urlToRead);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String line;
		while ((line = rd.readLine()) != null) {
		   result.append(line);
		}
		rd.close();
		return result.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                /*String name;
                Scanner rd = new Scanner(System.in);
                name = rd.next();
		try {
			

                        
            
                    
            developper(name);
            
            
                      
                          
                        
                        
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	}

    private static String developper(String name) throws Exception{			           
        
        String result  = getHTML("https://en.wikipedia.org/w/api.php?action=query&titles=+"+name+"&prop=revisions&rvprop=content&format=json");
           
                                   
            //Developper                       
            System.out.println(result);
            result= result.replace("[",""); //reemplaza '[' con nada
            result= result.replace("]",""); //reemplaza ']' con nada
            result= result.replace("="," ");  //reemplaza '=' con nada
           // result= result.replace("\\u014d", "o");  //reemplaza o con caracter especial con O
            String search_variable = "\\n| developer "; // Lo que va buscar en el api
            int pos = result.indexOf(search_variable); // La posicion en el arreglo de string en el api
            pos+=search_variable.length(); // Suma la longitud del String result_variable en pos
            while(result.charAt(pos)==' ') // While para quitar espacios en blanco
                pos++;
           // System.out.print(result.charAt(pos));
         
            String result_variable = "";
           for(int i=pos;result.charAt(i)!='\\'&&result.charAt(i)!='('&&result.charAt(i)!='<';i++)
            {
                
               // System.out.println(result.charAt(i));
                result_variable+=result.charAt(i);
            }
                   // System.out.println("Developer: " +result_variable );
            //System.out.println(result_variable); 
           return result_variable;
     }
    private static String type(String name) throws Exception{			           
        
        String result  = getHTML("https://en.wikipedia.org/w/api.php?action=query&titles=+"+name+"&prop=revisions&rvprop=content&format=json");
           
                                   
            //Developper                       
            System.out.println(result);
            result= result.replace("[",""); //reemplaza '[' con nada
            result= result.replace("]",""); //reemplaza ']' con nada
            result= result.replace("="," ");  //reemplaza '=' con nada
           // result= result.replace("\\u014d", "o");  //reemplaza o con caracter especial con O
            String search_variable = "\\n| type  "; // Lo que va buscar en el api
            int pos = result.indexOf(search_variable); // La posicion en el arreglo de string en el api
            pos+=search_variable.length(); // Suma la longitud del String result_variable en pos
            while(result.charAt(pos)==' ') // While para quitar espacios en blanco
                pos++;
           // System.out.print(result.charAt(pos));
         
            String result_variable = "";
           for(int i=pos;result.charAt(i)!='\\'&&result.charAt(i)!='('&&result.charAt(i)!='<';i++)
            {
                
               // System.out.println(result.charAt(i));
                result_variable+=result.charAt(i);
            }
                   // System.out.println("Developer: " +result_variable );
            //System.out.println(result_variable); 
           return result_variable;
     }
     private static String manufact(String name) throws Exception{			           
        
        String result  = getHTML("https://en.wikipedia.org/w/api.php?action=query&titles=+"+name+"&prop=revisions&rvprop=content&format=json");
           
                                   
            //Developper                       
            System.out.println(result);
            result= result.replace("[",""); //reemplaza '[' con nada
            result= result.replace("]",""); //reemplaza ']' con nada
            result= result.replace("="," ");  //reemplaza '=' con nada
           // result= result.replace("\\u014d", "o");  //reemplaza o con caracter especial con O
            String search_variable = "\\n| manufacturer "; // Lo que va buscar en el api
            int pos = result.indexOf(search_variable); // La posicion en el arreglo de string en el api
            pos+=search_variable.length(); // Suma la longitud del String result_variable en pos
            while(result.charAt(pos)==' ') // While para quitar espacios en blanco
                pos++;
           // System.out.print(result.charAt(pos));
         
            String result_variable = "";
           for(int i=pos;result.charAt(i)!='\\'&&result.charAt(i)!='('&&result.charAt(i)!='<';i++)
            {
                
               // System.out.println(result.charAt(i));
                result_variable+=result.charAt(i);
            }
                   // System.out.println("Developer: " +result_variable );
            //System.out.println(result_variable); 
           return result_variable;
     }
    
    //Devuelve el developper
    public static String deve(String name){
    
           //  String name;
             //   Scanner rd = new Scanner(System.in);
               // name = rd.next();
        String dev=""; 
        
		try {       
           dev = developper(name);
           
		} catch (Exception e) {
			e.printStackTrace();
		}
              return dev;  
    }
    
    //Devuelve el type
      public static String ty(String name){
    
           //  String name;
             //   Scanner rd = new Scanner(System.in);
               // name = rd.next();
        String type=""; 
        
		try {       
           type = type(name);
           
		} catch (Exception e) {
			e.printStackTrace();
		}
              return type;  
    }
      
      
      //Devuelve Manufacture
         public static String manuf(String name){
    
           //  String name;
             //   Scanner rd = new Scanner(System.in);
               // name = rd.next();
        String fact=""; 
        
		try {       
           fact = manufact(name);
           
		} catch (Exception e) {
			e.printStackTrace();
		}
              return fact;  
    }

    
   

   
    }

        
        

