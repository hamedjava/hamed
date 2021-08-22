package ApiAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfirstshoppingapplication.R;
import com.squareup.picasso.Picasso;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import ApiAdapters.HomeApi.Slider;

public class SliderAdapter extends RecyclerView.Adapter<SliderAdapter.SliderViewHolder> {

    List<Slider> sliders;
    Context context;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    public SliderAdapter(Context context,List<Slider>sliders){
        this.context = context;
        this.sliders = sliders;
    }

    @NonNull
    @NotNull
    @Override
    public SliderViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(this.context).inflate(R.layout.sliders_item,parent,false);
        return new SliderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull SliderAdapter.SliderViewHolder holder, int position) {

        Picasso.with(this.context).load(sliders.get(position).getMedium().get(0).getUrl()).into(holder.img_slider);

        holder.img_slider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*goToPaymentFragment(new PaymentFragment(context));*/
            }
        });
    }

    @Override
    public int getItemCount() {
        return sliders.size();
    }

    public class SliderViewHolder extends RecyclerView.ViewHolder{
        ImageView img_slider;
        public SliderViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            img_slider = itemView.findViewById(R.id.img_slider);
        }
    }

    public void goToPaymentFragment(Fragment fragment){
        ((FragmentActivity)context).getSupportFragmentManager().beginTransaction()
                .replace(R.id.flContentFramLayout, fragment).addToBackStack("")
                .commit();
    }
}
