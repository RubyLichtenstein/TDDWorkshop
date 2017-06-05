package com.example.ruby.tddworkshop.ui.creategroup;

import io.reactivex.Observable;

/**
 * Created by Ruby on 6/5/2017.
 */

public interface CreateGroupMVPContract {
  interface View {
    Observable<CharSequence> userActionInputGroupName();

    Observable<Object> userActionCreateGroup();
  }

  interface Presenter {
    void createGroup(String groupName);
  }
}
