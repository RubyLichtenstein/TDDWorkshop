package com.example.ruby.tddworkshop.ui.creategroup;

import com.example.ruby.tddworkshop.data.GroupsRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * Created by Ruby on 6/5/2017.
 */
public class CreateGroupPresenterTest {

  CreateGroupPresenter presenter;

  @Mock CreateGroupMVPContract.View view;
  @Mock GroupsRepository groupsRepository;

  @Before public void setUp() throws Exception {
    presenter = new CreateGroupPresenter(groupsRepository, view);
  }

  /**
   * lets mock the view
   *
   * @throws Exception
   */
  @Test public void createGroup_groupNameNotValid_viewShowGroupNameNotValidMsg() throws Exception {
    presenter.createGroup("ab");

    Mockito.verify(groupsRepository, Mockito.times(0)).createGroup(Mockito.any());

    //verify NOT call GroupsRepository#createGroup()
    Mockito.verify(view, Mockito.times(1)).showMsgGroupNameNotValid();

    //verify NOT call CreateGroupMVPContract.View#back()
    Mockito.verify(view, Mockito.times(0)).back();
  }

  @Test public void createGroup_groupNameValid_callRepoCreateGroupAndViewBack() throws Exception {
    presenter.createGroup("abc");

    //verify call GroupsRepository#createGroup()
    Mockito.verify(groupsRepository, Mockito.times(1)).createGroup(Mockito.any());

    //verify call CreateGroupMVPContract.View#back()
    Mockito.verify(view, Mockito.times(1)).back();
  }
}