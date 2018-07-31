package tonydarko.spealth.controller.adapters;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Optional;
import tonydarko.spealth.R;
import tonydarko.spealth.model.HomeItem;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

    ArrayList<HomeItem> items;
    Context context;
    OnItemClick onItemClick;

    public HomeAdapter(ArrayList<HomeItem> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(context)
                .inflate(R.layout.home_item, parent, false);
        return new ViewHolder(item);
    }

    public void setOnItemClick(OnItemClick onItemClick) {
        this.onItemClick = onItemClick;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.bind(items.get(position));
    }

    public interface OnItemClick {
        void onItemClick(int position);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.card)
        CardView cardView;
        @BindView(R.id.tv_category)
        TextView category;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void bind(HomeItem item) {
            category.setText(item.getName());
            cardView.setBackgroundResource(item.getBackground());

        }


        @OnClick(R.id.card)
        void onItemClick() {
            if (onItemClick != null) {
                onItemClick.onItemClick(getAdapterPosition());
            }

        }

    }

}
