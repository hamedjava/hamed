package ApiAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfirstshoppingapplication.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class DiscountAdapter extends RecyclerView.Adapter<DiscountAdapter.DiscountsViewHolder> {

    List<String> discounts;
    Context context;

    public DiscountAdapter(Context context,List<String>discounts){
        this.context = context;
        this.discounts = discounts;
    }

    @NonNull
    @NotNull
    @Override
    public DiscountsViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(this.context).inflate(R.layout.discount_items,parent,false);
        return new DiscountsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull DiscountAdapter.DiscountsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return discounts.size();
    }

    public class DiscountsViewHolder extends RecyclerView.ViewHolder{

        public DiscountsViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
        }
    }
}
