package com.krishighar.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.krishighar.R;
import com.krishighar.model.MarketValueModel;

import java.util.List;


/**
 * Created by NaRan on 10/11/17 at 07:28.
 */

public class MarkertValueAdapter extends RecyclerView.Adapter<MarkertValueAdapter.ViewHolders> {

    private Context context;
    List<MarketValueModel> marketValueList;
    private int lastPosition = -1;

    public MarkertValueAdapter(Context context, List<MarketValueModel> marketValueList) {
        this.context = context;
        this.marketValueList = marketValueList;
    }

    @Override
    public MarkertValueAdapter.ViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.market_value_list_row, parent, false);

        return new ViewHolders(itemView);
    }

    @Override
    public void onBindViewHolder(MarkertValueAdapter.ViewHolders holder, int position) {

        final MarketValueModel marketValue = marketValueList.get(position);


        holder.fullName.setText(marketValue.getName());
        holder.priceName.setText(marketValue.getThokAverage());
        holder.unitName.setText(marketValue.getUnit());




        Animation animation = AnimationUtils.loadAnimation(context,
                (position > lastPosition) ? R.anim.up_from_bottom
                        : R.anim.down_from_top);

        holder.itemView.startAnimation(animation);
        lastPosition = position;

    }

    @Override
    public int getItemCount() {
        return marketValueList.size();
    }

    @Override
    public void onViewDetachedFromWindow(ViewHolders holder) {
        super.onViewDetachedFromWindow(holder);
        holder.itemView.clearAnimation();

    }

    public class ViewHolders extends RecyclerView.ViewHolder {

        private TextView fullName;
        private TextView priceName;
        private TextView unitName;


        public ViewHolders(View itemView) {
            super(itemView);
            fullName = itemView.findViewById(R.id.full_name);
            priceName = itemView.findViewById(R.id.price);
            unitName = itemView.findViewById(R.id.unitt);
        }
    }
}
