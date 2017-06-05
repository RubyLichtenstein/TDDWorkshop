package com.example.ruby.tddworkshop.ui.creategroup;

import com.example.ruby.tddworkshop.data.GroupsRepository;
import com.example.ruby.tddworkshop.util.InputValidator;
import com.example.ruby.tddworkshop.util.InputValidatorImpl;
import io.reactivex.Observable;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * Created by Ruby on 6/5/2017.
 */
@RunWith(MockitoJUnitRunner.class) public class CreateGroupPresenterTest {

  private String validGroupName = "abc";
  private String notValidGroupName = "ab";

  CreateGroupPresenter presenter;

  @Mock CreateGroupMVPContract.View view;
  @Mock GroupsRepository groupsRepository;
  @Mock InputValidator inputValidator;

  @Before public void setUp() throws Exception {
    presenter = new CreateGroupPresenter(inputValidator, groupsRepository, view);
  }

  /**
   * lets mock the view
   *
   * @throws Exception
   */
  @Test public void createGroup_groupNameNotValid_viewShowGroupNameNotValidMsg() throws Exception {
    //stub input validator to return false
    Mockito.when(inputValidator.isGroupNameValid(notValidGroupName)).thenReturn(false);

    presenter.createGroup("ab");

    Mockito.verify(groupsRepository, Mockito.times(0)).createGroup(Mockito.any());

    //verify NOT call GroupsRepository#createGroup()
    Mockito.verify(view, Mockito.times(1)).showMsgGroupNameNotValid();

    //verify NOT call CreateGroupMVPContract.View#back()
    Mockito.verify(view, Mockito.times(0)).back();
  }

  @Test public void createGroup_groupNameValid_callRepoCreateGroupAndViewBack() throws Exception {
    //stub input validator to return true
    Mockito.when(inputValidator.isGroupNameValid(validGroupName)).thenReturn(true);

    presenter.createGroup("abc");

    //verify call GroupsRepository#createGroup()
    Mockito.verify(groupsRepository, Mockito.times(1)).createGroup(Mockito.any());

    //verify call CreateGroupMVPContract.View#back()
    Mockito.verify(view, Mockito.times(1)).back();
  }
}