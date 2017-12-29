package es.juanfbermejo.contador;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private int contador;               // Variable que almacena el contador
    private TextView textoContador;     // Variable que representa la vista del contador

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Damos valor inicial al contador
        contador = 0;

        // Recuperamos la vista texto del contador
        textoContador = (TextView) findViewById( R.id.textoContador );

    }

    /**
     * Método que incrementa el contador
     * @param vista
     */
    public void incrementaContador( View vista ){
        contador++;

        // Actualizamos el texto de la vista
        textoContador.setText( "" + contador);
    }

    /**
     * Método que decrementa el contador
     * @param vista
     */
    public void decrementaContador( View vista ){

        contador--;

        // Comprobamos el valor del contador una vez decrementado
        if( contador < 0 ){

            // Recuperamos el CheckBox que indica si se permite el conteo negativo
            CheckBox permiteNegativos = (CheckBox) findViewById( R.id.permiteNegativos );

            // Comprobamos si no se permite el conteo negativo y asignamos 0 al contador
            if( !permiteNegativos.isChecked() ){
                contador = 0;
            }

        }

        // Actualizamos el texto de la vista
        textoContador.setText( "" + contador);
    }

    /**
     * Método que resetea el contador
     * @param vista
     */
    public void reseteaContador( View vista ){

        // Recuperamos el EditText que almacena el valor inicial
        EditText valorInicial = (EditText) findViewById( R.id.valorInicial );

        // Asignamos el valor al contador, comprobando si el usuario ha indicado un valor
        try {
            // Si el usuario indica un valor, lo asignamos
            contador = Integer.parseInt( valorInicial.getText().toString() );
        } catch ( Exception e ){
            // Si el usuario no ha indicado un valor, lo reseteamos a 0
            contador = 0;
        }

        // Reseteamos la vista del EditText
        valorInicial.setText("");

        // Actualizamos el texto de la vista
        textoContador.setText( "" + contador);

    }

}
