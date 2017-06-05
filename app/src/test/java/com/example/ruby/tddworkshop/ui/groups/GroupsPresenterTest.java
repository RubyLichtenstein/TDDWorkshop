package com.example.ruby.tddworkshop.ui.groups;

import com.example.ruby.tddworkshop.data.Group;
import com.example.ruby.tddworkshop.data.GroupsRepository;
import io.reactivex.Observable;
import io.reactivex.internal.operators.observable.ObservableCombineLatest;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

/**
 * Created by Ruby on 6/5/2017.
 */
@RunWith(MockitoJUnitRunner.class) public class GroupsPresenterTest {

  @Mock GroupsRepository repository;
  @Mock GroupsMVPContract.View view;

  GroupsPresenter groupsPresenter;

  @Before public void setUp() throws Exception {
    groupsPresenter = new GroupsPresenter(repository, view);
  }

  @Test public void loadGroups_repositoryHaveNoGroups_callViewShowNoGroupsMsg() throws Exception {

    //stub GroupsRepository#getGroups() to emit empty list
    Mockito.when(repository.getGroups()).thenReturn(Observable.just(new ArrayList<>()));

    groupsPresenter.loadGroups();

    //verify call view#showNoGroupsMsg()
    Mockito.verify(view, Mockito.times(1)).showNoGroupsMsg();
  }

  @Test public void loadGroups_repositoryHaveGroups_callViewShowGroups() throws Exception {
    //stub GroupsRepository#getGroups() to emit NOT empty list
    List<Group> groups = new ArrayList<>();
    groups.add(new Group());
    Mockito.when(repository.getGroups()).thenReturn(Observable.just(groups));

    groupsPresenter.loadGroups();

    //verify call view#showNoGroupsMsg()
    Mockito.verify(view, Mockito.times(1)).showGroups(any());
  }
}