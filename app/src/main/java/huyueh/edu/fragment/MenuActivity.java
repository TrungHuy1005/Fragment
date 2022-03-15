package huyueh.edu.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.List;

public class MenuActivity extends Fragment {
    GridView gridView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.menu_layout, container, false);

        String[] menu = getResources().getStringArray(R.array.menu);

        ListView listView = view.findViewById(R.id.idMenu);
        listView.setAdapter(new ArrayAdapter<>(getActivity(), R.layout.menu_layout, menu));
        listView.setOnItemClickListener((adapterView, view1, i, l) -> {
            ContentActivity contentFragment = (ContentActivity) getParentFragmentManager().findFragmentById(R.id.contentLayout);
            contentFragment.updateFrag(i);
        });
        return view;
    }
}
