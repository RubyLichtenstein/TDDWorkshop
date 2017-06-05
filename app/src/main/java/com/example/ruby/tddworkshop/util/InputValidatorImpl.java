package com.example.ruby.tddworkshop.util;

/**
 * Created by Ruby on 6/5/2017.
 */

public class InputValidatorImpl implements InputValidator {
  /**
   * @return true if groupName.length > 2
   */
  @Override public boolean isGroupNameValid(String groupName) {
    return groupName.length() > 2;
  }
}
