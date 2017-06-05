package com.example.ruby.tddworkshop.ui.groups;

import com.example.ruby.tddworkshop.data.Group;
import io.reactivex.Observable;
import java.util.List;

/**
 * Created by Ruby on 6/5/2017.
 */

public interface GroupsMVPContract {

  interface View {
    void showGroups(List<Group> groups);

    void showNoGroupsMsg();

    Observable<Object> userActionCreateGroup();
  }

  interface Presenter {
    void loadGroups();

    void createGroup();
  }
}
