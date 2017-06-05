package com.example.ruby.tddworkshop.ui.groups;

import com.example.ruby.tddworkshop.data.Group;
import io.reactivex.Observable;
import java.util.List;

/**
 * Created by Ruby on 6/5/2017.
 */

public class GroupsPresenter implements GroupsMVPContract.Presenter {
  @Override public Observable<List<Group>> loadGroups() {
    return null;
  }

  @Override public void createGroup() {

  }
}
