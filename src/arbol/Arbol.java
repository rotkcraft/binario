package arbol;
 


public class Arbol<E>
{
	 private Nodo<E> raiz;

	    public Arbol( )
	    {
	        raiz = null;
	    }

	    public void insertar(E dato)
	    {
	        raiz = insertarArbol(dato, raiz);
	    }

	    public boolean existe(E dato)
	    {
	        return existeEnArbol(dato, raiz);
	    }

	    public String mostrarElementosInOrden( )
	    {
	    	StringBuilder sb=new StringBuilder();
	        mostrarElementosInOrden(raiz,sb);
	        return sb.toString();
	    }
	    
	    public String mostrarElementoPreOrden( )
	    {
	    	StringBuilder sb=new StringBuilder();
	    	mostrarElementosPreOrden(raiz,sb);
	       return sb.toString();
	    }
	    
	    public String mostrarElementoPosOrden( )
	    {
	    	StringBuilder sb=new StringBuilder();
	    	mostrarElementosPosOrden(raiz,sb);
	    	
	    	return sb.toString();
	    	 
	    }


		 
	    private  Nodo<E> insertarArbol(E dato,Nodo<E> nodo)
	    {
	        if (nodo == null)
	        {
	        	return new Nodo<E>(dato, null, null);

	        }
	         else if (((Comparable<E>)dato).compareTo(nodo.getDato()) <0 )
	        {
	            nodo.setIzquierda(insertarArbol(dato, nodo.getIzquierda()));
	            return nodo;
	        }
	        else  
	        {
	            nodo.setDerecha(insertarArbol(dato, nodo.getDerecha()));
	            return nodo;
	        }
	    }

	    private  boolean existeEnArbol(E dato, Nodo<E> nodo)
	    {
	        if (nodo == null)
	        {
	        	return false;
	        }
	        else if (((Comparable<E>)nodo.getDato()).compareTo(dato) ==0 )
	        {
	        	return true;
	        }
	        else if (((Comparable<E>)dato).compareTo(nodo.getDato()) <0 )
	        {
	        	return existeEnArbol(dato, nodo.getIzquierda());
	        }
	        else
	        {
	        	return existeEnArbol(dato, nodo.getDerecha());
	        }
	            
	    }

	    private  void mostrarElementosInOrden(Nodo<E> nodo,StringBuilder sb)
	    { 
	        if (nodo != null)
	        {
	        	mostrarElementosInOrden(nodo.getIzquierda(),sb);
	        	sb.append(nodo.getDato()+"\t");
	            mostrarElementosInOrden(nodo.getDerecha(),sb);
	        } 
	    }
	    
	    private  void mostrarElementosPreOrden(Nodo<E> nodo,StringBuilder sb)
	    { 
	        if (nodo != null)
	        {
	        	sb.append(nodo.getDato()+"\t");
	            mostrarElementosPreOrden(nodo.getIzquierda(),sb);
	            
	        	mostrarElementosPreOrden(nodo.getDerecha(),sb);
	        } 
	    }
	    
	    private  void mostrarElementosPosOrden(Nodo<E> nodo,StringBuilder sb)
	    { 
	        if (nodo != null)
	        {

	        	mostrarElementosPosOrden(nodo.getIzquierda(),sb);
	            
	        	mostrarElementosPosOrden(nodo.getDerecha(),sb);
	        	sb.append(nodo.getDato()+"\t");
	            
	        } 
	    }
	    
	    
	    public Nodo<E> getraiz()
	    {
	    	return raiz;
	    }
	    
	    public E getRaiz()
	    {
	    	return raiz.getDato();
	    }

}
