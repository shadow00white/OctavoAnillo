package adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.septimoanillo.ListaSitiosTuristicos;
import com.example.septimoanillo.R;
import com.example.septimoanillo.moldes.MoldeTurismo;

import java.util.ArrayList;

public class AdaptadorTurismo  extends RecyclerView.Adapter <AdaptadorTurismo.viewHolder> {


    public ArrayList<MoldeTurismo> listaTurismo;

    public AdaptadorTurismo() {
    }

    @NonNull
    @Override
    public AdaptadorTurismo.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.moldeturismo,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.actualizarDatos(listaTurismo.get(position));
    }

    @Override
    public int getItemCount() {
        return listaTurismo.size();
    }

    public AdaptadorTurismo(ArrayList<MoldeTurismo> listaSitiosTuristicos) {
        this.listaTurismo = listaSitiosTuristicos;
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotoHotel;
        TextView nombreHotel;
        TextView precioHotel;
        TextView contactoHotel;


        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoHotel=itemView.findViewById(R.id.turismo1);
            nombreHotel=itemView.findViewById(R.id.nombreturismo);
            precioHotel =itemView.findViewById(R.id.precioturismo);
            contactoHotel =itemView.findViewById(R.id.contactoturismo);

        }

        public void actualizarDatos(MoldeTurismo moldeTurismo) {
            fotoHotel.setImageResource(moldeTurismo.getFoto());
            nombreHotel.setText(moldeTurismo.getNombreTurismo());
            precioHotel.setText(moldeTurismo.getPrecio());
            contactoHotel.setText(moldeTurismo.getTelefono());
        }
    }
}


