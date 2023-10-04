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
import com.example.septimoanillo.AmpliandoSitioTurismo;
import com.example.septimoanillo.ListaSitiosTuristicos;
import com.example.septimoanillo.R;
import com.example.septimoanillo.moldes.MoldeTurismo;

import java.util.ArrayList;

public class AdaptadorTurismo  extends RecyclerView.Adapter <AdaptadorTurismo.viewHolder> {


    public ArrayList<MoldeTurismo> listaTurismo;

    public AdaptadorTurismo() {
    }

    public AdaptadorTurismo(ArrayList<MoldeTurismo> listaSitiosTuristicos) {
        this.listaTurismo = listaSitiosTuristicos;
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

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotoTurismo;
        TextView nombreTurismo;
        TextView precioTurismo;
        TextView contactoGuia;
        TextView contactoTurismo;


        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoTurismo=itemView.findViewById(R.id.turismo1);
            nombreTurismo=itemView.findViewById(R.id.nombreturismo);
            precioTurismo =itemView.findViewById(R.id.precioturismo);
            contactoTurismo=itemView.findViewById(R.id.gmailTurismo);
            contactoTurismo=itemView.findViewById(R.id.contactoturismo);

        }

        public void actualizarDatos(MoldeTurismo moldeTurismo) {
            fotoTurismo.setImageResource(moldeTurismo.getFoto());
            nombreTurismo.setText(moldeTurismo.getNombre());
            precioTurismo.setText(moldeTurismo.getPrecio());
            contactoTurismo.setText(moldeTurismo.getContactoGuia());
            contactoTurismo.setText(moldeTurismo.getTelefono());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent= new Intent(itemView.getContext(), AmpliandoSitioTurismo.class);
                    intent.putExtra("datosturismo",moldeTurismo);
                    itemView.getContext().startActivity(intent);

                }
            });


        }
    }
}


