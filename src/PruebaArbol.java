import arbol.Arbol;

public class PruebaArbol 
{
    public static void main( String args[] )
    {
         Arbol<Character> arbol=new Arbol<Character>();
       
        System.out.println( "Insertando los siguientes valores: " );
        for ( char i = 'A'; i <= 'Z'; i++ ) 
        {
            
            arbol.insertar(i);
        }  
        System.out.println();
        System.out.println ( "recorrido preorden:" );
         System.out.println(); 
       
        System.out.println(  arbol.mostrarElementoPreOrden());
      
        System.out.println();
        System.out.println ( "recorrido inorden:" );
         System.out.println(arbol.mostrarElementosInOrden());
         
         System.out.println ( "recorrido posorden:" );
         System.out.println(arbol.mostrarElementoPosOrden());
          
        
        System.out.println( arbol.getRaiz());
        System.out.println(arbol.existe(arbol.getRaiz()));
        
    } 
}