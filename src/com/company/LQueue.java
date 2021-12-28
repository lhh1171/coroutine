package com.company;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class linkNode{
    Method post;
    linkNode next;
}

class link{
    linkNode head;
    linkNode tail;
}

public class LQueue {
    link link;
    public void createQueue(){
        this.link=new link();
        this.link.head=null;
        this.link.tail=null;
    }
    public void push(Method i){
        if (this.link.head==null){
            this.link.head=new linkNode();
            this.link.head.post=i;
        }else{
            if (this.link.tail==null){
                linkNode temp=new linkNode();
                temp.post=i;
                this.link.tail=temp;
                this.link.head.next=this.link.tail;
            } else {
                linkNode temp=new linkNode();
                temp.post=i;
                this.link.tail.next=temp;
                this.link.tail=temp;
            }
        }
    }
    public Method pop(){
        if (this.link.head!=null){
            Method i=this.link.head.post;
            this.link.head=this.link.head.next;
            return i;
        } else {
            return null;
        }
    }
    public void start() throws InvocationTargetException, IllegalAccessException {
        while (this.link.head!=null){
            this.link.head.post.invoke(null,  null);
            this.link.head=this.link.head.next;
        }
    }
}
