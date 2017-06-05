package com.example.ruby.tddworkshop.ui.creategroup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import io.reactivex.Observable;

/**
 * Created by Ruby on 6/5/2017.
 */

public class CreateGroupFragment extends Fragment implements CreateGroupMVPContract.View{

  @Override public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  }

  @Nullable @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    return super.onCreateView(inflater, container, savedInstanceState);
  }

  @Override public Observable<CharSequence> userActionInputGroupName() {
    return null;
  }

  @Override public Observable<Object> userActionCreateGroup() {
    return null;
  }

  @Override public void showMsgGroupNameNotValid() {

  }

  @Override public void back() {

  }
}
