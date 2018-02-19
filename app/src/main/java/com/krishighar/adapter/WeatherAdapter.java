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
import com.krishighar.model.WeatherModel;

import java.util.List;


/**
 * Created by NaRan on 10/11/17 at 07:28.
 */

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.ViewHolders> {

    private Context context;
    List<WeatherModel> weatherValueList;
    private int lastPosition = -1;

    public WeatherAdapter(Context context, List<WeatherModel> marketValueList) {
        this.context = context;
        this.weatherValueList = weatherValueList;
    }

    @Override
    public WeatherAdapter.ViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.weather_value_row, parent, false);

        return new ViewHolders(itemView);
    }

    @Override
    public void onBindViewHolder(WeatherAdapter.ViewHolders holder, int position) {

        final WeatherModel weatherValue = weatherValueList.get(position);

        holder.fullName.setText(weatherValue.getPlace());




        Animation animation = AnimationUtils.loadAnimation(context,
                (position > lastPosition) ? R.anim.up_from_bottom
                        : R.anim.down_from_top);

        holder.itemView.startAnimation(animation);
        lastPosition = position;

    }

    @Override
    public int getItemCount() {
        return weatherValueList.size();
    }

    @Override
    public void onViewDetachedFromWindow(ViewHolders holder) {
        super.onViewDetachedFromWindow(holder);
        holder.itemView.clearAnimation();

    }

    public class ViewHolders extends RecyclerView.ViewHolder {

        private TextView fullName;


        public ViewHolders(View itemView) {
            super(itemView);
            fullName = itemView.findViewById(R.id.one);
        }
    }
}
