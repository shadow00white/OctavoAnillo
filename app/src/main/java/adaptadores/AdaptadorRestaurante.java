package adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.septimoanillo.R;
import com.example.septimoanillo.moldes.MoldeRestaurante;

import java.util.ArrayList;

public class AdaptadorRestaurante  extends RecyclerView.Adapter <AdaptadorRestaurante.viewHolder> {

    public ArrayList<MoldeRestaurante> listaRestaurante;
     public int edad; 

    public AdaptadorRestaurante() {
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

    public AdaptadorRestaurante(ArrayList<MoldeRestaurante> listaRestaurante) {
        this.listaRestaurante = listaRestaurante;

    }

    public class viewHolder extends RecyclerView.ViewHolder {
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

        public void actualizarDatos(MoldeRestaurante moldeRestaurante) {
            fotoHotel.setImageResource(moldeRestaurante.getFoto());
            nombreHotel.setText(moldeRestaurante.getNombreRestaurante());
            precioHotel.setText(moldeRestaurante.getPrecio());
            contactoHotel.setText(moldeRestaurante.getTelefono());
        }
    }
}
