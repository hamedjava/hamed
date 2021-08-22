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

public class AmazingAdapter extends RecyclerView.Adapter<AmazingAdapter.AmazingViewHolder>{

    List<String> amazingItems;
    Context context;

    public AmazingAdapter(Context context,List<String>amazingItems){
        this.context = context;
        this.amazingItems = amazingItems;
    }

    @NonNull
    @NotNull
    @Override
    public AmazingViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(this.context).inflate(R.layout.amazing_items,parent,false);
        return new AmazingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull AmazingAdapter.AmazingViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return this.amazingItems.size();
    }

    public class AmazingViewHolder extends RecyclerView.ViewHolder{

        public AmazingViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
        }
    }

}
