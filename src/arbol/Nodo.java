package arbol;

public  class Nodo<E>
    {
        private E dato;
        private Nodo<E> izquierda;
        private Nodo<E> derecha;

        public Nodo(E dato, Nodo<E> izquierda,Nodo<E>derecha)
        {
             setDato(dato);
             this.setIzquierda(izquierda);
             this.setDerecha(derecha);
        }

		public E getDato ( )
		{
			return dato;
		}

		public void setDato ( E dato )
		{
			this.dato = dato;
		}

		public Nodo<E> getIzquierda ( )
		{
			return izquierda;
		}

		public void setIzquierda ( Nodo<E> izquierda )
		{
			this.izquierda = izquierda;
		}

		public Nodo<E> getDerecha ( )
		{
			return derecha;
		}

		public void setDerecha ( Nodo<E> derecha )
		{
			this.derecha = derecha;
		}
    } 
