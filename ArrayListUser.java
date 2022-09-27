package com.google.lesson03;

public class ArrayListUser implements IMyList{
    private User[] arr;


    public ArrayListUser() {
       this.arr = new User[0];
    }

    public User[] getUsers() {
        return this.arr;
    }

    public int size() {
        return this.arr.length;
    }

    public User getUser(int index) {
        return this.arr[index];
    }

    public User getFirst() {
        return this.arr[0];
    }

    public User getLast() {
        return this.arr[arr.length - 1];
    }

    public void addFirst(User user) {
        User[] temp = new User[arr.length + 1];
        temp[0] = user;
        int counter = 1;
        for (int i = 0; i < arr.length; ++i, ++counter) {
            temp[counter] = this.arr[i];
        }
        this.arr = temp;

    }

    public void addLast(User user) {

        User[] temp = new User[this.arr.length + 1];

        for (int i = 0; i < arr.length; ++i) {
            temp[i] = this.arr[i];
        }

        temp[this.arr.length] = user;
        this.arr = temp;


    }

    public void set(int index, User user) {
        arr[index] = user;
    }

    public User delete(int index) {
        User user = arr[index];
        int counter = 0;
        User[] temp = new User[arr.length - 1];

        for (int i = 0; i < arr.length; ++i) {
            if (i != index) {
                temp[counter] = this.arr[counter];
                ++counter;
            }
        }

        this.arr = temp;
        return user;
    }

}
