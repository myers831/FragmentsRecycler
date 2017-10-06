package com.example.admin.fragmentsrecycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 10/5/2017.
 */

public class CarListAdapter extends RecyclerView.Adapter<CarListAdapter.ViewHolder> {

    List<Car> carList = new ArrayList<>();
    Context context;

    public CarListAdapter(Context context, List<Car> carList) {
        this.carList = carList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.car_list_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Car car = carList.get(position);
        holder.tvModel.setText(car.getModel());
        holder.tvType.setText(car.getType());
        holder.tvYear.setText(car.getYear());

    }

    @Override
    public int getItemCount() {
        return carList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvModel;
        TextView tvType;
        TextView tvYear;

        public ViewHolder(View itemView) {
            super(itemView);

            tvModel = itemView.findViewById(R.id.tvModel);
            tvType = itemView.findViewById(R.id.tvType);
            tvYear = itemView.findViewById(R.id.tvYear);

        }
    }
}
