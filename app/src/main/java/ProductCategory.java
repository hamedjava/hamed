import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ProductCategory extends RecyclerView.Adapter<ProductCategory.ProductsCategoryViewHolder> {

    List<String> categories;
    Context context;

    public ProductCategory(Context context , List<String> categories){
        this.context = context;
        this.categories = categories;
    }

    @NonNull
    @NotNull
    @Override
    public ProductsCategoryViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(this.context).inflate(null,parent,false);
        return new ProductsCategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ProductCategory.ProductsCategoryViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public class ProductsCategoryViewHolder extends RecyclerView.ViewHolder{

        public ProductsCategoryViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
        }
    }
}
