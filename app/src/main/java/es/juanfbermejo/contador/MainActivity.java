package es.juanfbermejo.contador;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    private int contador;   // Variable que almacena el contador

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Damos valor inicial al contador
        contador = 0;

    }

    /**
     * Método que incrementa el contador
     * @param vista
     */
    public void incrementaContador( View vista ){
        contador++;

        // Actualizamos la vista
        mostrarContador();
    }

    /**
     * Método que decrementa el contador
     * @param vista
     */
    public void decrementaContador( View vista ){
        contador--;

        // Actualizamos la vista
        mostrarContador();
    }

    /**
     * Método que resetea el contador
     * @param vista
     */
    public void reseteaContador( View vista ){
        contador = 0;

        // Actualizamos la vista
        mostrarContador();
    }

    /**
     * Método que actualiza la vista para mostrar el valor del contador
     */
    public void mostrarContador(){

        // Recuperamos la vista de texto
        TextView textoContador = (TextView) findViewById( R.id.textoContador );

        // Actualizamos el texto de la vista
        textoContador.setText( "" + contador);
    }

}
