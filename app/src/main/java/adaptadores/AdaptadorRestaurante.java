package adaptadores;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.septimoanillo.AmpliandoRestaurante;
import com.example.septimoanillo.R;
import com.example.septimoanillo.moldes.MoldeRestaurante;

import java.util.ArrayList;

public class AdaptadorRestaurante  extends RecyclerView.Adapter <AdaptadorRestaurante.viewHolder> {

    public ArrayList<MoldeRestaurante> listaRestaurante;

    public AdaptadorRestaurante() {
    }

    public AdaptadorRestaurante(ArrayList<MoldeRestaurante> listaRestaurante) {
        this.listaRestaurante = listaRestaurante;

    }
    @NonNull
    @Override
    public AdaptadorRestaurante.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.molderestaurante,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorRestaurante.viewHolder holder, int position) {
         holder.actualizarDatos(listaRestaurante.get(position));
    }

    @Override
    public int getItemCount() {
        return listaRestaurante.size();
    }


    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotoRestaurante;
        TextView nombreRestaurante;
        TextView platoRecomendado;
        TextView precioRestaurante;
        TextView contactoRestaurante;


        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoRestaurante=itemView.findViewById(R.id.restaurante1);
            nombreRestaurante=itemView.findViewById(R.id.nombrerestaurante);
            precioRestaurante  =itemView.findViewById(R.id.precio);
            contactoRestaurante=itemView.findViewById(R.id.numerotelefono);
            platoRecomendado=itemView.findViewById(R.id.platoRecomendado);

        }

        public void actualizarDatos(MoldeRestaurante moldeRestaurante) {
            fotoRestaurante.setImageResource(moldeRestaurante.getFoto());
            nombreRestaurante.setText(moldeRestaurante.getNombreRestaurante());
            precioRestaurante .setText(moldeRestaurante.getPrecio());
            contactoRestaurante.setText(moldeRestaurante.getTelefono());
            platoRecomendado.setText(moldeRestaurante.getPlatoRecomendado());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(itemView.getContext(), AmpliandoRestaurante.class);
                    intent.putExtra("datosrestaurante",moldeRestaurante);
                    itemView.getContext().startActivity(intent);



                }
            });
        }
    }
}
