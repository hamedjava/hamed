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

public class BestSellersAdapter extends RecyclerView.Adapter<BestSellersAdapter.BestCellersViewHolder> {

    List<String> products;
    Context context;

    public BestSellersAdapter(Context context, List<String> products){
        this.context = context;
        this.products = products;
    }

    @NonNull
    @NotNull
    @Override
    public BestCellersViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(this.context).inflate(R.layout.bestcellers_items,parent,false);
        return new BestCellersViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull BestSellersAdapter.BestCellersViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class BestCellersViewHolder extends RecyclerView.ViewHolder{

        public BestCellersViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
        }
    }
}
