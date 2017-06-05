package com.example.ruby.tddworkshop.ui.groups;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.ruby.tddworkshop.data.Group;
import io.reactivex.Observable;
import java.util.List;

/**
 * Created by Ruby on 6/5/2017.
 */

public class GroupsFragment extends Fragment implements GroupsMVPContract.View {

  @Override public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  }

  @Nullable @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      Bundle savedInstanceState) {
    return super.onCreateView(inflater, container, savedInstanceState);
  }

  @Override public void showGroups(List<Group> groups) {

  }

  @Override public void showNoGroupsMsg() {

  }

  @Override public Observable<Object> userActionCreateGroup() {
    return null;
  }
}
