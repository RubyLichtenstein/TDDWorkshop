package com.example.ruby.tddworkshop.ui.groups;

import android.app.Fragment;
import com.example.ruby.tddworkshop.data.Group;
import io.reactivex.Observable;
import java.util.List;

/**
 * Created by Ruby on 6/5/2017.
 */

public class GroupsFragment extends Fragment implements GroupsMVPContract.View {
  @Override public void showGroups(List<Group> groups) {

  }

  @Override public void showNoGroupsMsg() {

  }

  @Override public Observable<Object> userActionCreateGroup() {
    return null;
  }
}
