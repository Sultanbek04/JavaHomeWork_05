package com.google.lesson03;

public interface IMyList {
    int size();

    User getUser(int index);

    User getFirst();

    User getLast();

    void addFirst(User user);

    void addLast(User user);

    void set(int index, User user);

     User delete(int index);

}
