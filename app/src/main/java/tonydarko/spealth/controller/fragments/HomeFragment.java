package tonydarko.spealth.controller.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import tonydarko.spealth.R;
import tonydarko.spealth.controller.adapters.HomeAdapter;
import tonydarko.spealth.model.HomeItem;

public class HomeFragment extends Fragment {

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @BindView(R.id.recycler_view_fragment_home)
    RecyclerView recyclerView;
    HomeAdapter homeAdapter;
    ArrayList<HomeItem> homeItemArrayList = new ArrayList<>(5);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(R.string.title_home);
        ButterKnife.bind(this, root);

        homeItemArrayList.add(new HomeItem("Friends", R.drawable.ic_launcher_background));
        homeItemArrayList.add(new HomeItem("Health", R.mipmap.ic_launcher_round));
        homeItemArrayList.add(new HomeItem("Sport", R.drawable.ic_launcher_background));
        homeItemArrayList.add(new HomeItem("Map", R.mipmap.ic_launcher_round));
        homeItemArrayList.add(new HomeItem("News", R.drawable.ic_launcher_background));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());

        homeAdapter = new HomeAdapter(homeItemArrayList,getContext());
        recyclerView.invalidate();
        recyclerView.setItemViewCacheSize(6);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(homeAdapter);

        return root;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }


}
