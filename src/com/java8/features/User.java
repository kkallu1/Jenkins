package com.java8.features;

import java.util.List;

class User {
	private String name=null;
	private Integer age = 30;
    private List<String> phoneNumbers;

      public User(String name, Integer age, List<String> phoneNumbers) {
          this.name = name;
          this.age = age;
          this.phoneNumbers = phoneNumbers;
      }

      public List<String> getPhoneNumbers() {
          return phoneNumbers;
      }

      public void setPhoneNumbers(List<String> phoneNumbers) {
          this.phoneNumbers = phoneNumbers;
      }
	public User(String name)
	{
		this.name=name;
	}
	@Override
	public String toString()
	{
		return name;
	}
	  public Integer getAge() {
          return age;
      }
}
