package adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.septimoanillo.AmpliandoHotel;
import com.example.septimoanillo.ListaHoteles;
import com.example.septimoanillo.R;
import com.example.septimoanillo.moldes.MoldeHotel;

import java.util.ArrayList;

public class AdaptadorHoteles extends RecyclerView.Adapter<AdaptadorHoteles.viewHolder> {

    // todos adaptador  tiene una lista de elementos
    //arraylist es una lista ordenada

    // Atributo del adaptador
    public ArrayList<MoldeHotel> listaHoteles;

    //se crea un constructor vacio

    public AdaptadorHoteles() {
    }

    // se crea un constructor lleno
    public AdaptadorHoteles(ArrayList<MoldeHotel> listaHoteles) {
        this.listaHoteles = listaHoteles;
    }

    // Molde

    @NonNull
    @Override
    public AdaptadorHoteles.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // esta porcion de codigo permite crear N copias del molde grafico

        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.moldehotel,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorHoteles.viewHolder holder, int position) {
        holder.actualizarDatos(listaHoteles.get(position));
    }

    @Override
    public int getItemCount() {
        return  listaHoteles.size();
    }

    public  class viewHolder extends RecyclerView.ViewHolder { // se agregan los tipos de datos sin son imageview o si son texteview, recuerda que tu contacto esta sepado del telefono en el, debes organizar
        ImageView fotoHotel;
        TextView nombreHotel;
        TextView precioHotel;
        TextView contactoHotel;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            fotoHotel=itemView.findViewById(R.id.fotoListaHotel);
            nombreHotel=itemView.findViewById(R.id.nombreListaHotel);
            precioHotel =itemView.findViewById(R.id.precioListaHotel);
            contactoHotel =itemView.findViewById(R.id.celularhotel);
        }

        public  void actualizarDatos(MoldeHotel moldeHotel) {
            fotoHotel.setImageResource(moldeHotel.getFoto());
            nombreHotel.setText(moldeHotel.getNombre());
            precioHotel.setText(moldeHotel.getPrecio());
            contactoHotel.setText(moldeHotel.getTelefono());


           itemView.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent intent= new Intent(itemView.getContext(), AmpliandoHotel.class);
                   intent.putExtra("datoshotel",moldeHotel);
                   itemView.getContext().startActivity(intent);
               }
           });


        }
    }
}
